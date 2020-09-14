package contatoreMVC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class contataoreMVC extends JFrame {
	public contataoreMVC() {
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Model modello=new Model();
				View vista=new View("contatore");
				Controller controller= new Controller(vista,modello);
				controller.assegnaGestori();
			}
		});
	}

}
