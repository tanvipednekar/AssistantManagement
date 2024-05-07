package com.test.mapper;

import com.test.dto.AssistantDto;
import com.test.entity.Assistant;
import com.test.service.AssistantService;

public class AssistantMapper {

    public static Assistant maptoAssistant(AssistantDto assistantDto) {

        Assistant assistant = new Assistant(
                assistantDto.getId(),
                assistantDto.getName(),
                assistantDto.getEmail(),
                assistantDto.getMobile(),
                assistantDto.getRole(),
                assistantDto.getDepartment(),
                assistantDto.getSalary(),
                assistantDto.getCity(),
                assistantDto.getCountry()
        );
        return assistant;
    }

    public static AssistantDto maptoAssistantDto(Assistant assistant) {

        AssistantDto assistantDto = new AssistantDto(
                assistant.getId(),
                assistant.getName(),
                assistant.getEmail(),
                assistant.getMobile(),
                assistant.getRole(),
                assistant.getDepartment(),
                assistant.getSalary(),
                assistant.getCity(),
                assistant.getCountry()
        );
        return assistantDto;
    }
}
