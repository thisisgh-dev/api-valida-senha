package com.itau.api.service;

import org.springframework.stereotype.Service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Validador2Service {   

    public static Boolean validaSenha(final String senha) {

        if (senha.length() < 9) {
            return false;
        }

        boolean numero = false;
        boolean maiuscula = false;
        boolean minuscula = false;
        boolean simbolo = false;
        boolean repete = false;

        String s = "!@#$%^&*()-+";

        for (char ch : s.toCharArray()) {
            for (char c : senha.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    numero = true;
                } else if (c >= 'A' && c <= 'Z') {
                    maiuscula = true;
                } else if (c >= 'a' && c <= 'z') {
                    minuscula = true;
                } else if (ch == c) {
                    simbolo = true;
                } else if (!senha.matches("(.)\\1+")) {
                    repete = true;
                }
            }
        }

        return numero && maiuscula && minuscula && simbolo && repete;
    }
}
