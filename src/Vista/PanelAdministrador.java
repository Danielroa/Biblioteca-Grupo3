package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Choice;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Logica.Biblioteca;

/**
 * 
 * @author MicroSoftware
 *
 */
public class PanelAdministrador extends JPanel implements ActionListener {

	private JLabel lbli, lbln, image;
	private JButton btnAgregarCliente, btnEditarCliente, btnEliminarCliente , btnAgregarLibro,  btnEliminarLibro, btnEditarLibro ,btnListaCliente;

	Biblioteca e = Biblioteca.getInstance();

	/**
	 * Constructor de la Clase PanelDirectorGeneral, donde se modifica su contenido
	 */
	public PanelAdministrador() {
		//LOGO YAMANTAKA
		JLabel Logo = new JLabel(new ImageIcon(getClass().getResource("../imagenes/admin.png")));

		//BOTON AGREGAR CLIENTE
		ImageIcon iconAgregarCliente = new ImageIcon(getClass().getResource("../Imagenes/crearCliente.png"));
		ImageIcon iEscalaAC = new ImageIcon(iconAgregarCliente.getImage().getScaledInstance(70, 105, java.awt.Image.SCALE_DEFAULT));
		btnAgregarCliente = new JButton(iEscalaAC);
		btnAgregarCliente.addActionListener(this);
		btnAgregarCliente.setBackground(null);
		btnAgregarCliente.setBorderPainted(false);

		//BOTON EDITAR CLIENTE
		ImageIcon iconEditarCliente = new ImageIcon(getClass().getResource("../Imagenes/modificarCliente.png"));
		ImageIcon iEscalaEC = new ImageIcon(iconEditarCliente.getImage().getScaledInstance(70, 105, java.awt.Image.SCALE_DEFAULT));
		btnEditarCliente = new JButton(iEscalaEC);
		btnEditarCliente.addActionListener(this);
		btnEditarCliente.setBackground(null);
		btnEditarCliente.setBorderPainted(false);

		//BOTON ELIMINAR CLIENTE
		ImageIcon iconEliminarCliente = new ImageIcon(getClass().getResource("../Imagenes/EliminarCliente.png"));
		ImageIcon iEscalaElC = new ImageIcon(iconEliminarCliente.getImage().getScaledInstance(70, 105, java.awt.Image.SCALE_DEFAULT));
		btnEliminarCliente = new JButton(iEscalaElC);
		btnEliminarCliente.addActionListener(this);
		btnEliminarCliente.setBackground(null);
		btnEliminarCliente.setBorderPainted(false);

		//BOTON CREAR LIBRO ADMINISTRADOR
		ImageIcon iconAgregarLibro = new ImageIcon(getClass().getResource("../Imagenes/agregarlibro.png"));
		ImageIcon iEscalaLC = new ImageIcon(iconAgregarLibro.getImage().getScaledInstance(70, 105, java.awt.Image.SCALE_DEFAULT));
		btnAgregarLibro = new JButton(iEscalaLC);
		btnAgregarLibro.addActionListener(this);
		btnAgregarLibro.setBackground(null);
		btnAgregarLibro.setBorderPainted(false);


		//BOTON EDITAR LIBRO
		ImageIcon iconEditarMembresia = new ImageIcon(getClass().getResource("../Imagenes/editarlibro.png"));
		ImageIcon iEscalaEditarLibro = new ImageIcon(iconEditarMembresia.getImage().getScaledInstance(70, 105, java.awt.Image.SCALE_DEFAULT));
		btnEditarLibro = new JButton(iEscalaEditarLibro);
		btnEditarLibro.addActionListener(this);
		btnEditarLibro.setBackground(null);
		btnEditarLibro.setBorderPainted(false);

		btnEliminarLibro = new JButton("Eliminar Libro");
		btnEliminarLibro.addActionListener(this);
		ImageIcon iconEliminarLibro = new ImageIcon(getClass().getResource("../Imagenes/eliminarlibro.png"));
		ImageIcon iEscalaAM = new ImageIcon(iconEliminarLibro.getImage().getScaledInstance(70, 105, java.awt.Image.SCALE_DEFAULT));
		btnEliminarLibro = new JButton(iEscalaAM);
		btnEliminarLibro.addActionListener(this);
		btnEliminarLibro.setBackground(null);
		btnEliminarLibro.setBorderPainted(false);


		btnListaCliente = new JButton("Eliminar Libro");
		btnListaCliente.addActionListener(this);
		ImageIcon iconListaCliente = new ImageIcon(getClass().getResource("../Imagenes/busqueda.png"));
		ImageIcon iEscalaListaCliente= new ImageIcon(iconEliminarLibro.getImage().getScaledInstance(70, 105, java.awt.Image.SCALE_DEFAULT));
		btnListaCliente = new JButton(iconListaCliente);
		btnListaCliente.addActionListener(this);
		btnListaCliente.setBackground(null);
		btnListaCliente.setBorderPainted(false);

		//Sub-Panel
		JPanel panelDatos = new JPanel();

		//CAMBIO DE CONFIGURACION DE DISE�O DEL PANEL
		panelDatos.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();


		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(btnAgregarCliente, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(btnEditarCliente, gbc);

		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(btnEliminarCliente, gbc);



		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;		
		panelDatos.add(btnAgregarLibro, gbc);
		panelDatos.add(btnAgregarLibro);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(btnEliminarLibro, gbc);

		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(btnEditarLibro, gbc);

		gbc.gridx =1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(btnListaCliente, gbc);

		
		
		
		
		//FONDO TRANSPARENTE AL PANEL DATOS
		panelDatos.setBackground(null);

		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(3, 3, 3, 3);
		this.add(Logo, gbc1);

		gbc1.gridx = 0;
		gbc1.gridy = 1;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(3, 3, 3, 3);
		this.add(panelDatos, gbc1);

		// COLOR DEL FONDO
		this.setBackground(new Color(255, 194, 92));

		Font osb = new Font("Open Sans", Font.BOLD, 15); // Tipo de letra
		Font os = new Font("Open Sans", Font.PLAIN, 14);


	}

	//ACTION PERFORMED
	/**
	 * Metodo que se encarga de capturar los eventos que ocurran en el JPanel
	 */
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == btnAgregarCliente) {


			VentanaAgregarCliente v1 = new VentanaAgregarCliente();
		}
		if (evento.getSource() == btnEditarCliente) {

			VentanaEditarCliente v2 = new VentanaEditarCliente();



		}
		if (evento.getSource() == btnEliminarCliente) {

			VentanaEliminarCliente v3 = new VentanaEliminarCliente();

		}

		if (evento.getSource() == btnAgregarLibro) {

			VentanaAgregarLibro v4= new VentanaAgregarLibro();

		}
if(evento.getSource()==btnListaCliente){
	VentanaListaCliente vc= new VentanaListaCliente();
}





	}

}

