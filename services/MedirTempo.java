package services;

import entities.CalcularFibonacciBI;
import entities.CalcularFibonacciIT;
import entities.CalcularFibonacciRe;

public class MedirTempo {
	
	public MedirTempo() {
		
	}
	
	public void tempo(int n) {
		
		CalcularFibonacciIT cfi = new CalcularFibonacciIT();
		CalcularFibonacciRe cfr = new CalcularFibonacciRe();
		CalcularFibonacciBI cfb = new CalcularFibonacciBI();
		
		long startIt = System.nanoTime();
        cfi.CalcularIT(n);
        long tempoIt = System.nanoTime() - startIt;

        long startRe = System.nanoTime();
        cfr.CalcularRE(n);
        long tempoRe = System.nanoTime() - startRe;

        long startBi = System.nanoTime();
        cfb.CalcularBinet(n);
        long tempoBi = System.nanoTime() - startBi;
		
		System.out.println("Tempo de execução (em milissegundos)");
        System.out.println("Iterativa : " + tempoIt / 1000000.0);
        System.out.println("Recursiva : " + tempoRe / 1000000.0);
        System.out.println("Binet : " + tempoBi / 1000000.0);

	}

}
