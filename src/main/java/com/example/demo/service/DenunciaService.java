package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import com.example.demo.model.Denuncia;
import org.springframework.stereotype.Service;
import com.example.demo.repository.DenunciaRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DenunciaService {
    private final DenunciaRepository denunciaRepository;

    public void save(Denuncia denuncia){

        denunciaRepository.save(denuncia);
    }

    public List<Denuncia> findAll(){

        return denunciaRepository.findAll();
    }

    public Optional<Denuncia> findById(String id){

        return denunciaRepository.findById(id);
    }
    public void deleteById(String id){

        denunciaRepository.deleteById(id);
    }
}
