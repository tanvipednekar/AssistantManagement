package com.test.service.impl;

import com.test.dto.AssistantDto;
import com.test.entity.Assistant;
import com.test.mapper.AssistantMapper;
import com.test.repository.AssistantRepository;
import com.test.service.AssistantService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssistantServiceImpl implements AssistantService {

    private AssistantRepository assistantRepository;

    public AssistantServiceImpl(AssistantRepository assistantRepository) {
        this.assistantRepository = assistantRepository;
    }

    @Override
    public AssistantDto createAssistant(AssistantDto assistantDto) {

        Assistant assistant = AssistantMapper.maptoAssistant(assistantDto);
        Assistant savedAssistant = assistantRepository.save(assistant);
        return AssistantMapper.maptoAssistantDto(savedAssistant);
    }

    @Override
    public AssistantDto getAssistantById(Integer id) {

        Assistant assistant = assistantRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("[!] Assistant does not exist"));

        return AssistantMapper.maptoAssistantDto(assistant);
    }

    @Override
    public AssistantDto incrementSalary(Integer id, Double increment) {

        Assistant assistant = assistantRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("[!] Assistant does not exist"));

        assistant.setSalary(assistant.getSalary()+increment);
        Assistant savedAssistant = assistantRepository.save(assistant);

        return AssistantMapper.maptoAssistantDto(savedAssistant);
    }

    @Override
    public List<AssistantDto> getAllAssistants() {

        List<Assistant> list = assistantRepository.findAll();

        return list.stream().map((assistant) -> AssistantMapper.maptoAssistantDto(assistant))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAssistant(Integer id) {

        Assistant assistant = assistantRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("[!] Assistant does not exist"));

        assistantRepository.delete(assistant);

    }

    @Override
    public void deleteAllAssistants() {
        assistantRepository.deleteAll();
    }


}
