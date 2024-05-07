package com.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AssistantDto {

    private int id;
    private String name;
    private String email;
    private String mobile;
    private String role;
    private String department;
    private double salary;
    private String city;
    private String country;

}
