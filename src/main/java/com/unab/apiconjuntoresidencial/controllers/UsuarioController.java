package com.unab.apiconjuntoresidencial.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unab.apiconjuntoresidencial.models.dto.UsuarioDto;
import com.unab.apiconjuntoresidencial.models.peticiones.UsuarioCrearRequestModel;
import com.unab.apiconjuntoresidencial.models.respuestas.UsuarioDataResModel;
import com.unab.apiconjuntoresidencial.services.IUsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioService iUsuarioService;

 

    @PostMapping
    public UsuarioDataResModel crearUsuario(@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel){

        UsuarioDto usuarioDto= modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);

        UsuarioDto usuarioDtoCreado= iUsuarioService.crearUsuario(usuarioDto);

        UsuarioDataResModel usuarioDataResModel= modelMapper.map(usuarioDtoCreado,UsuarioDataResModel.class);


        return usuarioDataResModel;
    }

    @GetMapping
    public UsuarioDataResModel leerUsuario(){

        String numeroDocumento="91260467";

        UsuarioDto usuarioDto=iUsuarioService.leerUsuario(numeroDocumento);

        UsuarioDataResModel usuarioDataRestModel= modelMapper.map(usuarioDto,UsuarioDataResModel.class);

        return usuarioDataRestModel;

    }
    
}
