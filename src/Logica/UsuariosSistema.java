package Logica;

import java.util.ArrayList;

import Logica.UsuarioAdministrador;
import Logica.UsuarioCliente;

public class UsuariosSistema {

	
	private ArrayList<UsuarioCliente> listaCliente = new ArrayList<UsuarioCliente>();
	private ArrayList<UsuarioAdministrador> listaAdministrador = new ArrayList<UsuarioAdministrador>();


	public UsuariosSistema (){

		//--------------------ASESORES COMERCIALES POR DEFECTO--------------------------//

		UsuarioAdministrador usuario = new UsuarioAdministrador();
		
		usuario.setUsuario("Daniel");
		usuario.setcontrasena("123");
		

//		UsuarioCliente usuario1 = new UsuarioCliente();
//		
//		usuario1.setUsuario("Carlos");
//		usuario1.setcontrasena("19");

//
//		UsuarioCliente usuario2 = new UsuarioCliente();
//		
//		usuario2.setUsuario("Juan");
//		usuario2.setcontrasena("18");
//
//		UsuarioCliente usuario3 = new UsuarioCliente();
//
//		usuario3.setUsuario("Nestor");
//		usuario3.setcontrasena("22");


		
	}
	

	//LOGIN
	public static   boolean login (String usuario, String contrasena){
		boolean correcto = false;
			if (usuario.equals("Daniel")&& contrasena.equals("123")){
			correcto=true;	
				}
			if (usuario.equals("Carlos")&& contrasena.equals("19")){
				correcto=true;	
					}
			if (usuario.equals("Juan")&& contrasena.equals("18")){
				correcto=true;	
					}
			if (usuario.equals("Nestor")&& contrasena.equals("22")){
				correcto=true;	
					}
	return correcto;
			
				
				
				
	}


	public ArrayList<UsuarioCliente> getListaCliente() {
		return listaCliente;
	}


	public void setListaCliente(ArrayList<UsuarioCliente> listaCliente) {
		this.listaCliente = listaCliente;
	}


	public ArrayList<UsuarioAdministrador> getListaAdministrador() {
		return listaAdministrador;
	}


	public void setListaAdministrador(
			ArrayList<UsuarioAdministrador> listaAdministrador) {
		this.listaAdministrador = listaAdministrador;
	}
		}

