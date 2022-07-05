package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(String id){
        return usuarioRepository.findById(id);
    }
    public void deleteById(String id){
        usuarioRepository.deleteById(id);
    }
}