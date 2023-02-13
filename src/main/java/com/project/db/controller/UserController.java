package com.project.db.controller;

import com.project.db.entity.Usuario;
import com.project.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<Usuario> getAll(){
        return userService.getAll();
    }

    @GetMapping("/user/{id}")
    public Usuario getUsuario(@PathVariable String id){
        return (Usuario) userService.getUsuario(id);
    }
    @PostMapping("/user")
    public Usuario newUser(@RequestBody Usuario usuario){
        return userService.newUser(usuario);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }
}
