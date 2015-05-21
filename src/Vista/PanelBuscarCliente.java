package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Logica.Biblioteca;
import Logica.Cliente;
import Logica.InventarioCliente;




public class PanelBuscarCliente extends JPanel implements ActionListener {

	
	private JLabel lblInicial;
	private JLabel lblNombre;
	private JLabel lblApellido;

	private JTextField txtNombre;
	private JTextField txtApellido;

	private JButton btnBuscar, btnRestablecer;
	InventarioCliente inventarioCliente = new InventarioCliente(); 


	public PanelBuscarCliente() {
		
		lblInicial = new JLabel("Introduzca los datos del Cliente");
		lblNombre = new JLabel("Nombre:");
		txtNombre = new JTextField(10);
		lblApellido = new JLabel("Apellido:");
		txtApellido = new JTextField(10);
			btnBuscar = new JButton("Cliente Buscado");
		btnBuscar.addActionListener(this);
		btnRestablecer = new JButton("Restablecer Campos");
		btnRestablecer.addActionListener(this);

		//CREACION Y POSICIONAMIENTO DEL PANEL DE DATOS
		
	

		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		
	
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(30, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(lblNombre, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(30, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(txtNombre, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(lblApellido, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 10, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelDatos.add(txtApellido, gbc);

		panelDatos.setBackground(null);

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
		panelBotones.add(btnBuscar, gbc1);

		gbc1.gridx = 1;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(30, 3, 3, 3);
		gbc1.fill = GridBagConstraints.BOTH;
		gbc1.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnRestablecer, gbc1);

		panelBotones.setBackground(null);

		this.add(lblInicial);
		this.add(panelDatos);
		this.add(panelBotones);
		this.setBackground(new Color(255, 194, 92));

		Color cTipografia = new Color(127, 52, 45);
		Font osb = new Font("Open Sans", Font.BOLD, 15);
		Font os = new Font("Open Sans", Font.PLAIN, 14);
		lblInicial.setFont(osb);
		lblInicial.setForeground(cTipografia);
		lblNombre.setFont(os);
		lblNombre.setForeground(cTipografia);
		txtNombre.setFont(os);
		lblApellido.setForeground(cTipografia);
		lblApellido.setFont(os);
		txtApellido.setFont(os);
		btnBuscar.setFont(osb);
		btnBuscar.setBackground(new Color(127, 52, 45));
		btnBuscar.setForeground(new Color(255, 194, 92));
		btnRestablecer.setFont(osb);
		btnRestablecer.setBackground(new Color(127, 52, 45));
		btnRestablecer.setForeground(new Color(255, 194, 92));
	
	}
	

	public String getTxtNombre() {
		return txtNombre.getText();
	}

	public void setTxtNombre(String txtNombre) {
		this.txtNombre.setText(txtNombre);
	}

	public String getTxtApellido() {
		return txtApellido.getText();
	}

	public void setTxtApellido(String txtApellido) {
		this.txtApellido.setText(txtApellido);
	}


	public JButton getBtnAgregar() {
		return btnBuscar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnBuscar = btnAgregar;
	}

	public JButton getBtnRestablecer() {
		return btnRestablecer;
	}

	public void setBtnRestablecer(JButton btnRestablecer) {
		this.btnRestablecer = btnRestablecer;
	}

	public void actionPerformed(ActionEvent evento) {

			if (evento.getSource() == btnRestablecer) {
				setTxtNombre(null);
				setTxtApellido(null);

			}
			if (evento.getSource() == btnBuscar) {

//				
//				txtNombre.setText(getTxtNombre());
//				txtApellido.setText(getTxtApellido());
//				inventarioCliente.eliminarCliente(txtId);
//				
	JOptionPane.showMessageDialog(this, "El usuario busco correctamente");

					

	}

}
}