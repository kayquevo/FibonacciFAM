package entities;

public class Binet {
	
	public static long CalcularBinet(int n) {
		double phi = (1 + Math.sqrt(5)) / 2;
		double psi = (1 - Math.sqrt(5)) / 2;
		
		double res = (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);
		
		return Math.round(res);
	}
	
}
