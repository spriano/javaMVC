package contatoreMVC;

public class TestModel {

	public static void main(String[] args) {
		
		Model model=new Model();
		
		/*
		 * verifica l'incremeno di x
		 * verifica se azzerabile diventa true quando x==5
		 */
		
		for (int i=0;i<7;i++) {
			model.incrementa();
			System.out.println(model.getX()+" "+model.isAzzerabile());
		}
		
		// verifica l'azzeramanto del contatore
		
		model.azzera();
		System.out.println(model.getX()+" "+model.isAzzerabile());

	}

}
