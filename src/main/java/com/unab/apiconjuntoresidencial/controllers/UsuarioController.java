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
import com.unab.apiconjuntoresidencial.models.respuestas.UsuarioDataRestModel;
import com.unab.apiconjuntoresidencial.services.IUsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioService iUsuarioService;

    @GetMapping
    public String leerUsuario(){

        return "Rodolfo";

    }

    @PostMapping
    public UsuarioDataRestModel crearUsuario(@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel){

        UsuarioDto usuarioDto= modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);

        UsuarioDto usuarioDtoCreado= iUsuarioService.crearUsuario(usuarioDto);

        UsuarioDataRestModel usuarioDataRestModel= modelMapper.map(usuarioDtoCreado,UsuarioDataRestModel.class);


        return usuarioDataRestModel;
    }
    
}
