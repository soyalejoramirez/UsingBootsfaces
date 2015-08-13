package com.is3.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;

import com.is3.px.Persona;

@SessionScoped
@ManagedBean(name="VerPersonasMB")
public class VerPersonasMB 
{
	private List<Persona> 	personas;
	private	Persona			personaSeleccionada;
	
	public VerPersonasMB() 
	{
		personas = new ArrayList<Persona>();
	}
	
	public void ver(Persona persona)
	{
		personaSeleccionada = persona;
		
		RequestContext.getCurrentInstance().execute("$('.modalPseudo').modal();");
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	public Persona getPersonaSeleccionada() {
		return personaSeleccionada;
	}
	
	public void setPersonaSeleccionada(Persona personaSeleccionada) {
		this.personaSeleccionada = personaSeleccionada;
	}
}
