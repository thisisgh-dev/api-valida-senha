package com.itau.api.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.itau.api.domain.Validador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValidadorServiceTest {

    @BeforeEach
    public Validador seteup() {
        Validador validador = new Validador("AbTp9!fok");
        return validador;        
    }


    @Test
    public void validaNumero(Validador validador) {        
        Boolean ok = ValidadorService.validaNumero(validador.getSenha());
        assertTrue(ok);
    }

    @Test
    public void validaSimbolo() {
        Validador validador = new Validador("AbTp9!fok");
        Boolean ok = ValidadorService.validaSimbolo(validador.getSenha());
        assertTrue(ok);
    }

    @Test
    public void validaMaiuscula() {
        Validador validador = new Validador("AbTp9!fok");
        Boolean ok = ValidadorService.validaMaiuscula(validador.getSenha());
        assertTrue(ok);
    }

    @Test
    public void validaMinuscula() {
        Validador validador = new Validador("AbTp9!fok");
        Boolean ok = ValidadorService.validaMinuscula(validador.getSenha());
        assertTrue(ok);
    }

    @Test
    public void validaRepeticao() {
        Validador validador = new Validador("AbTp9!fok");
        Boolean ok = ValidadorService.validaRepeticao(validador.getSenha());
        assertTrue(ok);
    }
    @Test
    public void noveOuMaisCaracteres() {
        Validador validador = new Validador("AbTp9!fok");
        Boolean ok = ValidadorService.validaTamanho(validador.getSenha());
        assertTrue(ok);
    }

//

    @Autowired
    private Validador1Service validador1service;
    
    @Test
    public void validaPassword() {
        Validador validador = new Validador("AbTp9!fok");
        Boolean ok = validador1service.validaPassword(validador.getSenha());
        assertTrue(ok);
    }

    @Test
    public void validaSenha() {
        Validador validador = new Validador("AbTp9!fok");
        Boolean ok = Validador2Service.validaSenha(validador.getSenha());
        assertTrue(ok);
    }
}
