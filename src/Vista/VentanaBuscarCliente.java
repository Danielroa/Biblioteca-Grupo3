package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaBuscarCliente extends JDialog {

	PanelBuscarCliente panel3;
	
	
	public VentanaBuscarCliente() {

		panel3 = new PanelBuscarCliente ();
		this.add(panel3);
		this.setTitle(" Buscar Cliente");
		this.setSize(360, 600);
		this.setModal(true);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		dispose();


	}
}
