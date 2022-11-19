package com.unab.apiconjuntoresidencial.models.respuestas;

import java.util.List;

public class UsuarioDataResModel {

    
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int idApartamento;
    private long numeroTelefonico;
    private List<InmuebleDataResModel> inmuebleDataResModelList;

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

    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
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


    public List<InmuebleDataResModel> getInmuebleDataResModelList() {
        return this.inmuebleDataResModelList;
    }

    public void setInmuebleDataResModelList(List<InmuebleDataResModel> inmuebleDataResModelList) {
        this.inmuebleDataResModelList = inmuebleDataResModelList;
    }


    
}
