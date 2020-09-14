package contatoreMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	
	// riferimenti alla View e al model
	private View  vista;
	private Model modello;
	
	
	public Controller(View vista, Model modello) {
		this.vista = vista;
		this.modello = modello;
	}
	
	public void assegnaGestori() {
		
		ActionListener gestoreIncremento;
		ActionListener gestoreAzzeramento;
		
		//crea il gestore di evento incrementa
		gestoreIncremento=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modello.incrementa();
				vista.setEtichetta(Integer.toString(modello.getX()));
				
				if(modello.isAzzerabile()) {
					vista.getBtnAzzera().setEnabled(true);
				}
			}	
	    };
	    // assegna il gestore di evento al bottone "Incremento"
	    vista.getBtnIncrementa().addActionListener(gestoreIncremento);
	    
	  //crea il gestore di evento azzera
	  		gestoreAzzeramento=new ActionListener() {
	  			public void actionPerformed(ActionEvent e) {
	  				modello.azzera();
	  				vista.setEtichetta("0");
	  				
	  				vista.getBtnAzzera().setEnabled(false);
	  			}	
	  	    };
	    vista.getBtnAzzera().addActionListener(gestoreAzzeramento);
	}

}
