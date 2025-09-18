package entities;

public class CalcularFibonacciRe{
	//Recursiva
	
	public CalcularFibonacciRe() {
		
	}
	
	public int CalcularRE(int n) {
		if(n <= 1) {
			return n;
		}
		
		return CalcularRE(n - 1) + CalcularRE(n - 2);
	}
}
