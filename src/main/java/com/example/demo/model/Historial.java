package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(value = "historial")
@Data
public class Historial{
    @Id
    private String id;
    private String idDenuncia;
    private String estadoDenuncia;
    private LocalDate fechaActualEstadoDenuncia;


    public Historial(String id, String idDenuncia, String estadoDenuncia, LocalDate fechaActualEstadoDenuncia){
        this.id = id;
        this.idDenuncia=idDenuncia;
        this.estadoDenuncia = estadoDenuncia;
        this.fechaActualEstadoDenuncia = fechaActualEstadoDenuncia;
    }
     /**
     *GETTERS
     */
    public String getId() {return id;}
    public String getIdDenuncia() {return idDenuncia;}
    public String getEstadoDenuncia() {return estadoDenuncia;}
    public LocalDate getFechaActualEstadoDenuncia() {return fechaActualEstadoDenuncia;}
    /**
     *SETTERS
     */
    public void setId(String id) {this.id = id;}
    public void setIdDenuncia(String idDenuncia) {this.idDenuncia = idDenuncia;}
    public void setEstadoDenuncia(String estadoDenuncia) {this.estadoDenuncia = estadoDenuncia;}
    public void setFechaActualEstadoDenuncia(LocalDate fechaActualEstadoDenuncia) {this.fechaActualEstadoDenuncia = fechaActualEstadoDenuncia;}


}

