package com.unab.apiconjuntoresidencial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.apiconjuntoresidencial.models.entidades.UsuarioEntity;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Long> {

    UsuarioEntity findByNumeroDocumento(String numeroDocumento);
    
}
