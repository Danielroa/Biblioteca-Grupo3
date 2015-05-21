package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaEliminarCliente extends JDialog {

	PanelConsultarCliente panel10;
	
	
	public VentanaEliminarCliente() {

		panel10 = new PanelConsultarCliente ();
		this.add(panel10);
		this.setTitle("Lista Cliente");
		this.setSize(360, 600);
		this.setModal(true);
	
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		dispose();


	}
}
