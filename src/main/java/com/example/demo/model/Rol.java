package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "rol")
@Data
public class Rol {
    @Id
    private String id;
    private String tipoRol;

    public Rol (String id , String tipoRol){
        this.id = id;
        this.tipoRol = tipoRol;
    }
    
    /**
     *GETTERS
     */
    public String getId() {return id;}
    public String getTipoRol() {return tipoRol;}

    /**
     *SETTERS
     */
    public void setId(String id) {this.id = id;}
    public void setTipoRol(String tipoRol) {this.tipoRol = tipoRol;}

    
}
