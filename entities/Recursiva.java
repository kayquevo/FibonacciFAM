package entities;

public class Recursiva{
	//Recursiva
	
	public Recursiva() {
		
	}
	
	public int CalcularRE(int n) {
		if(n <= 1) {
			return n;
		}
		
		return CalcularRE(n - 1) + CalcularRE(n - 2);
	}
}
