package com.project.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @Column(name = "user_name", nullable = false)
    private String userName;
    private String password;
    private String name;
}
