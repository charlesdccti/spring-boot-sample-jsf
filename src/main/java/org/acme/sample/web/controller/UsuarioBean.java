package org.acme.sample.web.controller;

import org.acme.sample.jsf.FacesViewScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by wolmir on 13/03/17.
 */
@Component("usuarioBean")
@Scope(FacesViewScope.NAME)
public class UsuarioBean implements Serializable {

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
