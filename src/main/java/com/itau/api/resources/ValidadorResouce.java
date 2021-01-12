package com.itau.api.resources;

import com.itau.api.domain.Validador;
import com.itau.api.service.Validador1Service;
import com.itau.api.service.Validador2Service;
import com.itau.api.service.ValidadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Validador de Senha")
@CrossOrigin(origins = "*")
public class ValidadorResouce {

    @GetMapping(value = "/validador")
    @ApiOperation(value = "Retorna TRUE quando a senha está correta")
    public ResponseEntity<Boolean> validador(@RequestBody Validador validador) {
        String senha = validador.getSenha();
        boolean obj = false;
        if (ValidadorService.validaNumero(senha)&&
            ValidadorService.validaSimbolo(senha)&&
            ValidadorService.validaMaiuscula(senha)&&
            ValidadorService.validaMinuscula(senha)&&
            ValidadorService.validaTamanho(senha)&&
            ValidadorService.validaRepeticao(senha)){
            obj = true;
        }  
        return ResponseEntity.ok().body(obj);
    }



//-----EXTRA--------------------------------------------------------

@Autowired
private Validador1Service validador1service;

    @GetMapping(value = "/validador1")
    @ApiOperation(value = "Segunda abordagem")
    
    public ResponseEntity<Boolean> validador1(@RequestBody Validador validador) {
        Boolean obj = validador1service.validaPassword(validador.getSenha());
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/validador2")
    @ApiOperation(value = "terceira abordagem")
    public ResponseEntity<Boolean> validador2(@RequestBody Validador validador) {
        Boolean obj = Validador2Service.validaSenha(validador.getSenha());
        return ResponseEntity.ok().body(obj);
    }
}
