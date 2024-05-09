package com.test.controller;

import com.test.dto.AssistantDto;
import com.test.entity.Assistant;
import com.test.service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/assistant")
public class AssistantController {

    @Autowired
    private AssistantService assistantService;

    public AssistantController(AssistantService assistantService) {
        this.assistantService = assistantService;
    }

    //REST API for adding assistant
    @PostMapping
    public ResponseEntity<AssistantDto> addAssistant(@RequestBody AssistantDto assistantDto)
    {
        return new ResponseEntity<>(assistantService.createAssistant(assistantDto), HttpStatus.CREATED);
    }

    //REST API for getting assistant by id
    @GetMapping("/{id}")
    public ResponseEntity<AssistantDto> getAssistantById(@PathVariable Integer id)
    {
        return new ResponseEntity<>(assistantService.getAssistantById(id), HttpStatus.OK);
    }

    //REST API for updating assistant
    @PutMapping("/{id}")
    public ResponseEntity<AssistantDto> updateAssistant(@PathVariable Integer id, @RequestBody AssistantDto updatedAssistantDto) {
        AssistantDto assistantDto = assistantService.updateAssistant(id, updatedAssistantDto);
        return ResponseEntity.ok(assistantDto);
    }

    //REST API for incrementing salary
    @PutMapping("/{id}/increment")
    public ResponseEntity<AssistantDto> incrementSalary(@PathVariable Integer id, @RequestBody Map<String, Double> request)
    {
        AssistantDto assistantDto = assistantService.incrementSalary(id, request.get("increment"));
        return ResponseEntity.ok(assistantDto);
    }

    //REST API to get all Assistants
    @GetMapping
    public ResponseEntity<List<AssistantDto>> getAllAssistants()
    {
        return new ResponseEntity<>(assistantService.getAllAssistants(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAssistant(@PathVariable Integer id)
    {
        assistantService.deleteAssistant(id);
        return ResponseEntity.ok("Assistant Info deleted successfully...");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllAssistants()
    {
        assistantService.deleteAllAssistants();
        return ResponseEntity.ok("All Assistant Info's deleted successfully...");
    }

}
