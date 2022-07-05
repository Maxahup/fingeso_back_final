package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.time.LocalDate;

@Document(value = "denuncia")
@Data
public class Denuncia {
    @Id
    private String id;
    private String rutDenunciante;
    private String rutDenunciado;
    private String correoDenunciante;
    private String correoDenunciado;
    private String estado;
    private LocalDate fecha;
    private String fiscal;
    private String actuario;
    private String medidasProteccion;
    private String resolucion;
    private List<Historial> fechas;

    public Denuncia(String rutDenunciante, String rutDenunciado, String correoDenunciado, String correoDenunciante, String estado, LocalDate fecha, String fiscal, String actuario, String medidasProteccion, String resolucion, List<Historial> fechas){
        this.rutDenunciante = rutDenunciante;
        this.rutDenunciado = rutDenunciado;
        this.correoDenunciado = correoDenunciado;
        this.correoDenunciante = correoDenunciante;
        this.estado = estado;
        this.fecha = fecha;
        this.fiscal = fiscal;
        this.actuario = actuario;
        this.medidasProteccion = medidasProteccion;
        this.resolucion = resolucion;
        this.fechas = fechas;
    }
    /**
     *SETTERS
     */
    public void setRutDenuciante(String rutDenunciante) { this.rutDenunciante = rutDenunciante; }
    public void setRutDenunciado(String rutDenunciado) { this.rutDenunciado = rutDenunciado; }
    public void setCorreoDenunciante(String correoDenunciante) { this.correoDenunciante = correoDenunciante; }
    public void setCorreoDenunciado(String correoDenunciado) { this.correoDenunciado = correoDenunciado; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setActuario(String actuario) { this.actuario = actuario; }
    public void setMedidasProteccion(String medidasProteccion) { this.medidasProteccion = medidasProteccion; }
    public void setResolucion(String resolucion) { this.resolucion = resolucion; }
    public void setFechas(List<Historial> fechas) { this.fechas = fechas; }

    /**
     *GETTERS
     */
    public String getId() {return id;}
    public String getRutDenunciante() {return rutDenunciante;}
    public String getRutDenunciado() {return rutDenunciado;}
    public String getCorreoDenunciante() {return correoDenunciante;}
    public String getCorreoDenunciado() {return correoDenunciado;}
    public String getEstado() {return estado;}
    public LocalDate getFecha() {return fecha;}
    public String getFiscal() {return fiscal;}
    public String getActuario() {return actuario;}
    public String getMedidasProteccion() {return medidasProteccion;}
    public String getResolucion() {return resolucion;}
    public List<Historial> getFechas() {return fechas;}

    boolean validarDenuncia(String rutDenunciante, String rutDenunciado){
        return true;
    }
}
