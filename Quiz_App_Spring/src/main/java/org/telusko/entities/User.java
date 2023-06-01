package org.telusko.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    private String username;

    @Column
    private String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}