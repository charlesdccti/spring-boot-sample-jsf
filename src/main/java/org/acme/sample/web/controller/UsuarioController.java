package org.acme.sample.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Component("usuarioController")
@Scope("request")
public class UsuarioController {

	@Autowired private UsuarioBean usuarioBean;
	
	public void submit() {
	    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Value:"+ usuarioBean.getValor()));
	}


	public void destroyWorld() {
		addMessage("System Error", "Please try again later.");
	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
}
