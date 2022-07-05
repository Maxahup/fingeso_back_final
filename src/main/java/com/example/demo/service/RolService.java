package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import com.example.demo.model.Rol;
import org.springframework.stereotype.Service;
import com.example.demo.repository.RolRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RolService {
    private final RolRepository rolRepository;

    public void save(Rol rol){

        rolRepository.save(rol);
    }

    public List<Rol> findAll(){

        return rolRepository.findAll();
    }

    public Optional<Rol> findById(String id){

        return rolRepository.findById(id);
    }
    public void deleteById(String id){

        rolRepository.deleteById(id);
    }
}