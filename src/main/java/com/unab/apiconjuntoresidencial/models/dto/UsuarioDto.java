package com.unab.apiconjuntoresidencial.models.dto;

import java.io.Serializable;

public class UsuarioDto implements Serializable{

    private static final long serialVersionUID=1L;
    
    private long id;
    private String nombre;
    private String apellido;
    private long numeroDocumento;
    private int idApartamento;
    private long numeroTelefonico;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getIdApartamento() {
        return this.idApartamento;
    }

    public void setIdApartamento(int idApartamento) {
        this.idApartamento = idApartamento;
    }

    public long getNumeroTelefonico() {
        return this.numeroTelefonico;
    }

    public void setNumeroTelefonico(long numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    
}