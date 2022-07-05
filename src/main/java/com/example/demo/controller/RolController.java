package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import com.example.demo.model.Rol;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.RolService;

import java.util.List;

@RestController
@RequestMapping(value = "/rol")
@RequiredArgsConstructor
public class RolController {
    private final RolService rolService;

    @PostMapping(value = "/")

    public void save(@RequestBody Rol rol){

        rolService.save(rol);
    }

    @GetMapping(value = "/getAll")
    public List<Rol> findAll(){

        return rolService.findAll();
    }
    @GetMapping(value = "/getById/{id}")
    public Rol findById(@PathVariable String id){

        return rolService.findById(id).get();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable String id){

        rolService.deleteById(id);
    }
}
