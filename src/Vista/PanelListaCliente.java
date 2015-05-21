package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;

import javax.swing.*;

import Logica.Biblioteca;
import Logica.Cliente;
import Logica.InventarioCliente;




public class PanelListaCliente extends JPanel implements ActionListener  {

	private JButton btnAgregar;
	private JTextArea txtArea;
    private JLabel lblInicial;
	InventarioCliente inventarioCliente = new InventarioCliente(); 


	public PanelListaCliente() {


		txtArea= new JTextArea(5,30);
		try {
			txtArea.setText(inventarioCliente.mostrarLista());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		add(txtArea);
		lblInicial = new JLabel("Introduzca los datos del Cliente");
		

		//CREACION Y POSICIONAMIENTO DEL PANEL DE BOTONES
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();

		
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(30, 3, 3, 3);
		gbc1.fill = GridBagConstraints.BOTH;
		gbc1.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnAgregar, gbc1);

}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}