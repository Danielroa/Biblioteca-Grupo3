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



/**
 * 
 * @author MicroSoftware
 * 
 */
public class PanelEliminarCliente extends JPanel implements ActionListener {


	Biblioteca e = Biblioteca.getInstance();

	JPanel pn = new JPanel();
	private JLabel lblId;
	private JTextField txtId;
	private JButton btnAceptar;



	/**
	 * Constructor de la Clase PanelEliminarCliente. Donde se modifica su contenido
	 */
	public PanelEliminarCliente(){
		//LOGO YAMANTAKA
				JLabel Logo = new JLabel(new ImageIcon(getClass().getResource("../imagenes/buscarCliente.png")));

		//TIPOS DE LETRAS REUTILIZABLES
		Font osb = new Font( "Open Sans",Font.BOLD,15); 
		Font os = new Font( "Open Sans",Font.PLAIN,14);

		//COLORES REUTILIZABLES
		Color marron = new Color(127, 52, 45);
		Color amarillo = new Color(255, 194, 92);

		lblId = new JLabel("Id: ");
		lblId.setForeground(marron);
		lblId.setFont(os);

		txtId = new JTextField(20);
		txtId.setFont(os);

		btnAceptar = new JButton("Buscar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBackground(marron);
		btnAceptar.setForeground(amarillo);
		btnAceptar.setFont(osb);


		pn.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		//		gbc1.anchor = GridBagConstraints.WEST;
		pn.add(lblId, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		//		gbc2.anchor = GridBagConstraints.WEST;
		pn.add(txtId, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(10, 3, 3, 3);
		gbc.fill = GridBagConstraints.EAST;
		//		gbc3.anchor = GridBagConstraints.WEST;
		pn.add(btnAceptar, gbc);

		pn.setBackground(null);


		this.add(pn);
		this.setForeground(marron);
		this.setBackground(amarillo);
		
		
		
		
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
		this.add(pn, gbc1);

		
		
	}

	/**
	 * Metodo que retorna el ID del cliente
	 * @return el ID ingresado en el JTextField
	 */
	public String getTxtId() {
		return txtId.getText();
	}

	/**
	 * Metodo que sustituye el ID
	 * @param txtId valor original ingresado en el JTextField de ID
	 */
	public void setTxtId(String txtId) {
		this.txtId.setText(txtId);
	}	



	@Override
	/**
	 * Metodo que se encarga de capturar los eventos que ocurran en el JPanel
	 */
	public void actionPerformed(ActionEvent evento) {
//		if (getTxtId().isEmpty()==true) {
//			JOptionPane.showMessageDialog(this, "Ingrese un ID");				
//		} else if (JOptionPane.showConfirmDialog(this,
//				e.confirmarEliminarCliente(getTxtId()),	"Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
//			JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente");
//			e.eliminarCliente(getTxtId());
//		}
//
//	}
	}
}
