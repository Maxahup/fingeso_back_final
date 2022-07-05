package com.example.demo.repository;

import com.example.demo.model.Denuncia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenunciaRepository extends MongoRepository<Denuncia, String>{

}