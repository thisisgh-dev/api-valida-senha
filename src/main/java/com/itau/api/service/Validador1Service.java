package com.itau.api.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Validador1Service {

    private static final String VALIDADOR = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{9,}$";

    public Boolean validaPassword(final String password) {

        if (password.matches("(.)\\1+")) {
            return false;
        }

        Pattern p = Pattern.compile(VALIDADOR);
        Matcher m = p.matcher(password);
        return m.matches();
    }  
}
