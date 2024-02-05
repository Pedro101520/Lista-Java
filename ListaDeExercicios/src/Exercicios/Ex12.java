package Exercicios;

import java.util.Scanner;

public class Ex12 {
	public static void main(String args[]) {
		double valor;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor do produto: ");
		valor = input.nextDouble();
		System.out.printf("O valor promocional e: %.2f", (valor * 0.95));
	}
}
