package Logica;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritor {
	private PrintWriter pw;

	public Escritor(File archivo) throws IOException {
	pw = new PrintWriter(archivo);
	}
	public void escribirLinea(String linea) throws IOException {
	pw.println(linea);
	}
	
	public void cerrar() throws IOException {
	pw.close();
	}
	}
	

