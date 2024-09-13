package com.example.university_project.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;



@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Student extends BaseClass{

    private String group;

}
