package com.is3.mb;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.is3.px.Persona;

@ViewScoped
@ManagedBean(name="AgregarPersonaMB")
public class AgregarPersonaMB 
{
	@ManagedProperty(value="#{VerPersonasMB.personas}")
    private List<Persona> personas;
	
	private String	nivelMsj;
	private String  mensaje;
	private boolean mostrarMsj;
	
	private String 	nombre;
	private String 	primerApellido;
	private String 	segundoApellido;
	private String 	email;
	private String 	sexo;
	private Date	fechaNacimiento;
	
	public AgregarPersonaMB()
	{
		mostrarMsj = false;
	}
	
	public void grabar()
	{
		Persona persona = new Persona();
		
		persona.setNombre			(nombre);
		persona.setPrimerApellido	(primerApellido);
		persona.setSegundoApellido	(segundoApellido);
		persona.setEmail			(email);
		persona.setSexo				(sexo);
		persona.setFechaNacimiento	(fechaNacimiento);
		
		personas.add(persona);
		
		mensaje		= "Persona guardada correctamente!";
		mostrarMsj	= true;
		nivelMsj 	= "success";
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getPrimerApellido());
		System.out.println(persona.getSegundoApellido());
		System.out.println(persona.getEmail());
		System.out.println(persona.getSexo());
		System.out.println(persona.getFechaNacimiento());
		
		System.out.println(personas.size());
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public String getNivelMsj() {
		return nivelMsj;
	}

	public void setNivelMsj(String nivelMsj) {
		this.nivelMsj = nivelMsj;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isMostrarMsj() {
		return mostrarMsj;
	}

	public void setMostrarMsj(boolean mostrarMsj) {
		this.mostrarMsj = mostrarMsj;
	}
}
