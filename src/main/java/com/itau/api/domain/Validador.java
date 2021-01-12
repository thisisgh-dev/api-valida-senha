package com.itau.api.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Validador implements Serializable{
    private static final long serialVersionUID = 7066468770836500900L;

    private String senha;      
}