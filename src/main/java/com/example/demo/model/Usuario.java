package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(value = "usuario")
@Data
public class Usuario {
    @Id
    private String id;
    private String nombre;
    private String rut;
    private String correo;
    private String password;
    private Integer rol;


    /**
     * Constructor de Usuario
     */

    public Usuario(String nombre,String rut, String correo, String password, Integer rol){
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }
    /**
     *SETTERS
     */
    public void setNombreUsuario(String nombre) { this.nombre = nombre; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setRut(String rut) { this.rut = rut; }
    public void setRol(Integer rol) { this.rol = rol; }
/**
     *GETTERS
     */
    public String getNombreUsuario() { return nombre; }
    public String getCorreo() { return correo; }
    public String getPassword() { return password; }
    public Integer getRol() { return rol; }
    public String getRut() { return rut; }



  // public Usuario solicitarIngresoDenuncia (Denuncia denuncia){
   //     return denuncia.solicitarIngresoDenuncia(this.getNombreUsuario(),this.getPassword());
    //}

    boolean validarUsuario(String rut, String password){
        return true;
    }
}
