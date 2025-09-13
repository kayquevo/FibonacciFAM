package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import services.CalcularFibonacci;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalcularFibonacci cf = new CalcularFibonacci();

		try {
			System.out.print("Digite o termo n da sequência: ");
			int n = sc.nextInt();
			
			cf.Calcular(n);
			System.out.println(cf);
		
		} catch (InputMismatchException e) {
			System.out.println("Valor de inserido inválido!");
		}

		sc.close();

	}

}
