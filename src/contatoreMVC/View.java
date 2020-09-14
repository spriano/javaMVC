package contatoreMVC;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class View {
	private JFrame finestra;
	private JButton btnAzzera;
	private JButton btnIncrementa;
	private JLabel etichetta;
	



	public void setValore(JLabel valore) {
		this.etichetta = valore;
	}

	private int conteggio=0;


	public View(String titolo) {
		finestra = new JFrame();
		finestra.setTitle(titolo);
		finestra.setBounds(100, 100, 450, 300);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.getContentPane().setLayout(new BorderLayout(0, 0));
		finestra.setVisible(true);
		
		btnAzzera = new JButton("Azzera");
		btnAzzera.setEnabled(false);
		finestra.getContentPane().add(btnAzzera, BorderLayout.NORTH);
		
		btnIncrementa = new JButton("Incrementa");
		
        finestra.getContentPane().add(btnIncrementa, BorderLayout.SOUTH);
		
		etichetta = new JLabel("0");
		etichetta.setFont(new Font("Lucida Grande", Font.PLAIN, 48));
		etichetta.setHorizontalAlignment(SwingConstants.CENTER);
		finestra.getContentPane().add(etichetta, BorderLayout.CENTER);
	}
	
	
	public void setEtichetta(String valore) {
		etichetta.setText(valore);
	}
	/**
	 * fornisce il riferimento al bottone per l'azzeramento
	 * @return il riferimanto al bottone
	 * E' indispensabile al controller per assegnare al bottone
	 * un gestore di evento
	 */

	public JButton getBtnAzzera() {
		return btnAzzera;
	}

	/**
	 * fornisce il riferimento al bottone per l'incremento
	 * @return il riferimanto al bottone
	 * E' indispensabile al controller per assegnare al bottone
	 * un gestore di evento
	 */
	
	public JButton getBtnIncrementa() {
		return btnIncrementa;
	}
	
	
}
