package com.example.university_project.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@MappedSuperclass
public abstract class BaseClass extends IdHolderClass{
    private String name;

    private int age;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ArrayList<Course> courses;
}
