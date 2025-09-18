package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Binet;
import entities.Iterativa;
import entities.Recursiva;
import services.MedirTempo;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("***SEQUÊNCIA DE FIBONACCI***");
			System.out.print("Digite o termo n da sequência: ");
			int n = sc.nextInt();
			
			System.out.println();
			
			Iterativa i = new Iterativa();
			System.out.println("Solução Iterativa");
			i.CalcularIT(n);
			System.out.println(i);
			System.out.println("--------------------------------");
			
			Recursiva r = new Recursiva();
			System.out.println("Solução Recursiva");
			System.out.println("F(" + n + ") = " + r.CalcularRE(n));
			System.out.println("--------------------------------");
			
			Binet b = new Binet();
			System.out.println("Solução Binet");
			System.out.println("F(" + n + ") = " + b.CalcularBinet(n));
			System.out.println("--------------------------------");
	
			MedirTempo mt = new MedirTempo();
			
			System.out.print("Mostrar sequência?(s/n): ");
			char resposta = sc.next().charAt(0);
			
			if(resposta == 's') {
				i.Sequencia();
				System.out.println(i);
			}
			
			System.out.println("--------------------------------");
			System.out.print("Mostrar tempo de execução?(s/n): ");
			char resposta2 = sc.next().charAt(0);
			
			if(resposta2 == 's') {
				System.out.println();
				mt.tempo(n);
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Valor inserido inválido!");
		}
		
		System.out.println("Fim do programa...");

		sc.close();

	}

}
