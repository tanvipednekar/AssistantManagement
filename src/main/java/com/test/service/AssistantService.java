package com.test.service;

import com.test.dto.AssistantDto;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface AssistantService {

    AssistantDto createAssistant(AssistantDto assistantDto);

    AssistantDto getAssistantById(Integer id);

    AssistantDto incrementSalary(Integer id, Double increment);

    List<AssistantDto> getAllAssistants();

    void deleteAssistant(Integer id);

    void deleteAllAssistants();
}
