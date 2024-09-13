package com.example.university_project.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Course extends IdHolderClass {

    @Enumerated(EnumType.STRING)
    private String type;
}
