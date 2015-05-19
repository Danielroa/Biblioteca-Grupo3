package Logica;

import java.util.ArrayList;

public class Biblioteca {
	private InventarioCliente inventarioCliente;
	private 	InventarioLibro inventarioLibro;
	private UsuariosSistema usuariosSistema;



	public Biblioteca(){
		InventarioCliente inventarioCliente=new InventarioCliente();
		UsuariosSistema usuario=new UsuariosSistema();
		InventarioLibro inventarioLibro=new InventarioLibro();

	}


	private static Biblioteca instance;

	/**
	 * M�todo que se encarga de que solo se cree UNA sola clase biblioteca.
	 * @return una instancia unica de la clase biblioteca.
	 */
	public static Biblioteca getInstance() {
		if (instance == null) {
			instance = new Biblioteca();
		}
		return instance;
	}

	//Hacer la contrase�a

	//LOGIN
	public boolean login (  String usuario, String contrasena){		
		return usuariosSistema.login(usuario, contrasena);
	}





	public void agregarCliente(String nombre, String apellido, String id, String usuario, String contrasena) throws Exception{
		inventarioCliente.agregarCliente(nombre, apellido, id, usuario, contrasena);


	}
	//mostrar lista cliente
	public void  mostrarLista() throws Exception{
		inventarioCliente.mostrarLista();
	}
	//mostrar lista libro
	public void  mostrarListaLibro() throws Exception{
		inventarioLibro.mostrarListaLibro();
	}
	//Buscar cliente
	public boolean buscarCliente(String id) throws Exception {
		return inventarioCliente.existeCliente(id);
	}
	//Calcular posicion
	public int calcularPosicion(String id) {
		return inventarioCliente.calcularPosicion(id);
	}


	//total clientes//
	public int totalCliente(){
		return inventarioCliente.totalClientes();
	}



	//total libros//
	public int totalLibro(){
		return inventarioLibro.totalLibros();
	}

	//editar  cliente
	public void editarCliente(String id, String nombre , String contrasena) {
		inventarioCliente.editarCliente(id,nombre, contrasena );
	}

	//metodo agregar libro//
	public void agregarLibro(String isbn,String nombreAutor,String tituloLibro,String anio, int cantidadLibros) throws Exception{

		inventarioLibro.agregarLibro(isbn, nombreAutor, tituloLibro, anio, cantidadLibros);
	}
	//Buscar libro
	public boolean buscarLibro(String isbn) throws Exception {
		return inventarioLibro.existeLibro(isbn);
	}
	//Calcular posicion libro
	public int calcularPosicionLibro(String isbn) {
		return inventarioLibro.calcularPosicionLibro(isbn);
	}

	public void eliminarLibro(String isbn) throws Exception{
		inventarioLibro.eliminarLibro(isbn);
	}
	public void eliminarCliente(String id1) throws Exception{
		inventarioCliente.eliminarCliente(id1);
	}
	public void consultarLibro(String isbn) throws Exception{
		inventarioLibro.consultarLibro(isbn);

	}
	public void consultarCliente(String id) throws Exception{
		inventarioCliente.consultarCliente(id);

	}
	//				editar  libro
	public void editarLibro(String nombreLibro,String isbn,  int cantidadLibros) {
		inventarioLibro.editarLibro(nombreLibro, isbn, cantidadLibros);
	}
	//------------------------------SET Y GET-------------------------------------------------------------------------------------------------
	public InventarioCliente getInventarioCliente() {
		return inventarioCliente;
	}

	public void setInventarioCliente(InventarioCliente inventarioCliente) {
		this.inventarioCliente = inventarioCliente;
	}

	public InventarioLibro getInventarioLibro() {
		return inventarioLibro;
	}

	public void setInventarioLibro(InventarioLibro inventarioLibro) {
		this.inventarioLibro = inventarioLibro;
	}

	public UsuariosSistema getUsuariosSistema() {
		return usuariosSistema;
	}

	public void setUsuariosSistema(UsuariosSistema usuariosSistema) {
		this.usuariosSistema = usuariosSistema;
	}

	public static void setInstance(Biblioteca instance) {
		Biblioteca.instance = instance;
	}

}
















