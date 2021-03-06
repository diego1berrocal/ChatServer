package servidor;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import comun.Usuarios;

public class VentanaUsuarios extends JFrame {
	JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JTextArea ta = new JTextArea(15,40);

	public VentanaUsuarios() {
		this.setSize(600, 400);

		this.setTitle("Usuarios");
		
		this.setLocationRelativeTo(MainServidor.vs);

		this.setContentPane(p);
		ta.setEditable(false);
		ta.setText("Usuarios"+"\n");
		JScrollPane scroll= new JScrollPane(ta);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		p.add(scroll);
		this.setVisible(true);
		for(String s:MainServidor.u.usuariosNombre){
			ta.setText(ta.getText()+s+"\n");
		}
	}

}
