package contatoreMVC;

public class Model
{
	private int x;
	private boolean azzerabile;
	
	public Model() {
		
		x=0;
		azzerabile=false;
	}
	
	public void incrementa() {
		x++;
		if(x==5) {
			azzerabile=true;
		}
	}
	 public void azzera() {
		 x=0;
		 azzerabile =false;
	 }

	public int getX() {
		return x;
	}

	

	public boolean isAzzerabile() {
		return azzerabile;
	}

}
