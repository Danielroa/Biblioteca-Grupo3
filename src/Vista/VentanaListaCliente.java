package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaListaCliente extends JDialog {
	
	PanelListaCliente panel11;
	
	
	public  VentanaListaCliente() {

		panel11 = new PanelListaCliente();
		this.add(panel11);
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
