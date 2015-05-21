package Logica;

import java.util.ArrayList;


public class InventarioCliente {
	
    private ArrayList<UsuarioCliente> listaCliente;

    public InventarioCliente(){

    	
        listaCliente = new ArrayList<UsuarioCliente>();

    }

    //Agregar Cliente

    public  void agregarCliente(String nombre,String apellido,String id ,String usuario,String contrasena){
            UsuarioCliente cliente = new UsuarioCliente(nombre,apellido,id ,usuario,contrasena);
            listaCliente.add(cliente);
          
    }

    //Mostrar lista ClienteS que agrego.
    public  String mostrarLista() throws Exception{
      for(int i=0;i<listaCliente.size();i++)
    	if (listaCliente.get(0) == null){
            System.out.println("La lista esta vacia"+listaCliente.get(i).getNombre());
        }else{
            for ( i = 0; i < listaCliente.size(); i++) {
            	System.out.println("tama�o: " + listaCliente.size());
            	 System.out.println(listaCliente.get(i).getNombre()+""+listaCliente.get(i).getApellido() + " " + listaCliente.get(i).getId() + " " + " " + listaCliente.get(i).getUsuario() + " " + listaCliente.get(i).getContrasena() );}
       
        
        }
	return listaCliente.toString();
      
    }

    //BUSCAR Cliente//
    public boolean existeCliente(String id)throws Exception{

        boolean encontro = false;
        for (int i = 0; (i < listaCliente.size() && !encontro); i++) {
        	 System.out.println(listaCliente.get(i).getNombre()+""+listaCliente.get(i).getApellido() + " " + listaCliente.get(i).getId() + " " + " " + listaCliente.get(i).getUsuario() + " " + listaCliente.get(i).getContrasena() );
             
        	if(id.equals(listaCliente.get(i).getId()))    {
                encontro = true;

            }


        }

        return encontro;

    }

    //ELIMINAR Cliente
    public void eliminarCliente (String id) throws Exception {
    	System.out.println("1");
        boolean pos=existeCliente(id);


            for (int i = 0; i < listaCliente.size(); i++) {
                if(id.equals(listaCliente.get(i).getId())){
                    listaCliente.remove(i);

                }
                
        }
    }

    //Consultar Cliente

    public UsuarioCliente consultarCliente(String id) throws Exception{
        UsuarioCliente Cliente = listaCliente.get(this.calcularPosicion(id));

        boolean encontro =false;
        for (int i = 0; (i < listaCliente.size() && !encontro); i++) {
            if(id.equals(listaCliente.get(i).getId())){
            	
            	encontro = true;
 
            	System.out.println(listaCliente.get(i).getNombre()+""+listaCliente.get(i).getApellido() + " " + listaCliente.get(i).getId() + " " + " " + listaCliente.get(i).getUsuario() + " " + listaCliente.get(i).getContrasena() );}
            
                   }
        return Cliente;

    }
    //    //CALCULAR POSICION
    public int calcularPosicion(String id) {
        boolean encontro = false;
        int pos = -1;
        for (int i = 0; (i < listaCliente.size() && !encontro); i++) {
            if(id.equals(listaCliente.get(i).getId()))    {
                encontro = true;
                pos = i;
            }
        }
        return pos;
    }

    public void editarCliente(String id , String nombre, String contrasenia ) {
    	boolean encontro = false;
    	for (int i = 0; (i < listaCliente.size() && !encontro); i++) {
            if(id.equals(listaCliente.get(i).getId()))    {
            	encontro = true;
        
            	
        listaCliente.get(i).setUsuario(nombre);
        listaCliente.get(i).setContrasena(contrasenia);
              
            }
    	}}

    
    //total clientes//
    public int totalClientes(){
    	
    	return listaCliente.size();
    
    }
	public String toString(){
		
		return "" +listaCliente;
	}


    public ArrayList<UsuarioCliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<UsuarioCliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

}