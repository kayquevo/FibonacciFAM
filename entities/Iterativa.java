package entities;

import java.util.ArrayList;

public class Iterativa {
	
	private Integer valor;
	private Integer n = 0;
	
	private ArrayList<Integer> fibonacci = new ArrayList<>();
	
	public Iterativa() {
		
	}
	
	public void CalcularIT(int n) {

		
		if (n <= 0) {
			System.out.println("O número de termos deve ser maior que 0");
		}

		fibonacci.add(1);

		if (n >= 2) {
			fibonacci.add(1);
		}

		for (int i = 2; i < n; i++) {
			int ultimo = fibonacci.get(fibonacci.size() - 1);
			int penultimo = fibonacci.get(fibonacci.size() - 2);
			int proximoTermo = ultimo + penultimo;

			fibonacci.add(proximoTermo);
		}
		
		valor = fibonacci.get(fibonacci.size() - 1);
		this.n = n;
		
		long tempoFinal = System.currentTimeMillis();
		
	}
	
	public void Sequencia() {
		for(int i = 1 ; i < fibonacci.size(); i++) {
			System.out.println("F(" + i + ") = " + fibonacci.get(i - 1));
		}
		
	}
		
	@Override
	public String toString() {
		return "F(" + n + ") = " + valor;
	}
	
	
	
}
