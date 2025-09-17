package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import services.CalcularFibonacciBI;
import services.CalcularFibonacciIT;
import services.CalcularFibonacciRe;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalcularFibonacciIT cfi = new CalcularFibonacciIT();
		CalcularFibonacciRe cfr = new CalcularFibonacciRe();
		CalcularFibonacciBI cfb = new CalcularFibonacciBI();

		try {
			System.out.println("***SEQUÊNCIA DE FIBONACCI***");
			System.out.print("Digite o termo n da sequência: ");
			int n = sc.nextInt();
			
			System.out.println();
			
			System.out.println("Solução Iterativa");
			cfi.CalcularIT(n);
			System.out.println(cfi);
			
			System.out.println("--------------------------------");
			
			System.out.println("Solução Recursiva");
			System.out.println("F(" + n + ") = " + cfr.CalcularRE(n));
			
			System.out.println("--------------------------------");
			
			System.out.println("Solução Binet");
			System.out.println("F(" + n + ") = " + cfb.CalcularBinet(n));
			System.out.println("--------------------------------");
			
			System.out.print("Mostrar sequência?(s/n): ");
			char resposta = sc.next().charAt(0);
			
			if(resposta == 's') {
				cfi.Sequencia();
				System.out.println(cfi);
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Valor inserido inválido!");
		}
		
		System.out.println("Fim do programa...");

		sc.close();

	}

}
