package com.example.university_project.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class IdHolderClass {

    @Id
    private Long id;
}
