package com.unab.apiconjuntoresidencial.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.unab.apiconjuntoresidencial.models.dto.UsuarioDto;
import com.unab.apiconjuntoresidencial.models.entidades.UsuarioEntity;
import com.unab.apiconjuntoresidencial.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioRepository iUsuarioRepository;

    @Override
    public UsuarioDto crearUsuario(UsuarioDto usuarioDto) {

      if(iUsuarioRepository.findByNumeroDocumento(usuarioDto.getNumeroDocumento()) !=null){
            throw new RuntimeException("Este Numero de Cedula ya se encuentra registrado");
        }

        
        UsuarioEntity usuarioEntity= modelMapper.map(usuarioDto, UsuarioEntity.class);
        
        UsuarioEntity usuarioEntityCreado=iUsuarioRepository.save(usuarioEntity);

        UsuarioDto usuarioDtoCreado= modelMapper.map(usuarioEntityCreado,UsuarioDto.class);

        return usuarioDtoCreado;
    }

    @Override
    public UsuarioDto leerUsuario(String numeroDocumento) {

        UsuarioEntity usuarioEntity= iUsuarioRepository.findByNumeroDocumento(numeroDocumento);

       /* if(usuarioEntity==null){
            throw new UsernameNotFoundException(numeroDocumento);
            
        }*/

        UsuarioDto usuarioDto= modelMapper.map(usuarioEntity, UsuarioDto.class);
        
        return usuarioDto;
    }
    
}
