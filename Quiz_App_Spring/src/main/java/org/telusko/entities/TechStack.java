package org.telusko.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "tech_stacks")
public class TechStack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String techStackName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechStackName() {
        return techStackName;
    }

    public void setTechStackName(String techStackName) {
        this.techStackName = techStackName;
    }}