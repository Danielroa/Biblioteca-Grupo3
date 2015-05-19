package Logica;

import Logica.Persona;

public class UsuarioCliente extends Persona {

	private String usuario ;
	private String contrasena ;
	
	public UsuarioCliente (String nombre,String  apellido, String id,String usuario, String contrasena){
		super( nombre, apellido, id);
		this.usuario=usuario;
		this.contrasena=contrasena;
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}



}
