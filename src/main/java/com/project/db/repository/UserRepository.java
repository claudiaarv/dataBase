package com.project.db.repository;

import com.project.db.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Usuario, String>{
}

