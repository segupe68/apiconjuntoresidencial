package com.unab.apiconjuntoresidencial.models.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name= "inmueble")
@EntityListeners(AuditingEntityListener.class)
@Table(indexes = {
    @Index(columnList = "idInmueble", name = "index_idInmueble", unique = true)
})
public class InmuebleEntity implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idInmueble;

    @Column(nullable = false)
    private String tipoInmueble;

    @Column(nullable = false)
    private String torre;

    @Column(nullable = false)
    private String numeroInmueble;

    @CreatedDate
    private Date creado;

    @ManyToOne
    @JoinColumn(name ="numero_documento")
    private UsuarioEntity usuarioEntity;

    @ManyToOne
    @JoinColumn(name ="id_obligacion")
    private ObligacionEntity ObligacionEntity;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdInmueble() {
        return this.idInmueble;
    }

    public void setIdInmueble(String idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getTipoInmueble() {
        return this.tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getTorre() {
        return this.torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    public String getNumeroInmueble() {
        return this.numeroInmueble;
    }

    public void setNumeroInmueble(String numeroInmueble) {
        this.numeroInmueble = numeroInmueble;
    }

    public Date getCreado() {
        return this.creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public UsuarioEntity getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public ObligacionEntity getObligacionEntity() {
        return this.ObligacionEntity;
    }

    public void setObligacionEntity(ObligacionEntity ObligacionEntity) {
        this.ObligacionEntity = ObligacionEntity;
    }





}
