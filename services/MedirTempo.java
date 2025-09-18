package services;

import entities.Binet;
import entities.Iterativa;
import entities.Recursiva;

public class MedirTempo  {
	
	public MedirTempo() {
		
	}
	
	public void tempo(int n) {
		Iterativa cfi = new Iterativa();
		Recursiva cfr = new Recursiva();
		Binet cfb = new Binet();
		
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
