package com.itau.api.service;

import org.springframework.stereotype.Service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidadorService {

    public static boolean validaNumero(final String senha) {
        
        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean validaSimbolo(final String senha) {
        
        String s = "!@#$%^&*()-+";
        for (char ch : s.toCharArray()) {
            for (char c : senha.toCharArray()) {
                if (ch == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean validaMaiuscula(final String senha) {
       
        for (char c : senha.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
        }
        return false;
    }

    public static boolean validaMinuscula(final String senha) {
        
        for (char c : senha.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                return true;
            }
        }
        return false;
    }

    public static boolean validaTamanho(final String senha) {
        return senha.length() >= 9;
    }

    public static boolean validaRepeticao(final String senha) {

        char[] letras = new char[senha.length()];

        for (int i = 0; i < letras.length; i++) {
            letras[i] = senha.charAt(i);

            for (int j = i + 1; j < senha.length(); j++) {
                if (letras[i] == senha.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
