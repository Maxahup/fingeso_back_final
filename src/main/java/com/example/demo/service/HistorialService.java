package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import com.example.demo.model.Historial;
import org.springframework.stereotype.Service;
import com.example.demo.repository.HistorialRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HistorialService {
    private final HistorialRepository historialRepository;

    public void save(Historial historial){

        historialRepository.save(historial);
    }

    public List<Historial> findAll(){

        return historialRepository.findAll();
    }

    public Optional<Historial> findById(String id){

        return historialRepository.findById(id);
    }
    public void deleteById(String id){

        historialRepository.deleteById(id);
    }
}