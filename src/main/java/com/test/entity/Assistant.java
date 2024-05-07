package com.test.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="assistantInfo")
@Entity
public class Assistant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="assistant_name")
    private String name;
    private String email;
    private String mobile;
    private String role;
    private String department;
    private double salary;
    private String city;
    private String country;


//    s id, name, mobile, email, salary, city, country, department, role


}
