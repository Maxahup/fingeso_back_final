package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import com.example.demo.model.Historial;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.HistorialService;

import java.util.List;

@RestController
@RequestMapping(value = "/historial")
@RequiredArgsConstructor
public class HistorialController {
    private final HistorialService historialService;

    @PostMapping(value = "/")

    public void save(@RequestBody Historial historial){

        historialService.save(historial);
    }

    @GetMapping(value = "/getAll")
    public List<Historial> findAll(){

        return historialService.findAll();
    }
    @GetMapping(value = "/getById/{id}")
    public Historial findById(@PathVariable String id){

        return historialService.findById(id).get();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable String id){

        historialService.deleteById(id);
    }
}
