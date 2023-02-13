package com.project.db.service;

import com.project.db.entity.Usuario;
import com.project.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<Usuario> getAll(){
        return repository.findAll();
    }

    @GetMapping("/user/{id}")
    public Usuario getUsuario(@PathVariable String id){
        return repository.findById(id).get();
    }
    @PostMapping("/user")
    public Usuario newUser(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id){
        repository.deleteById(id);
    }
}
