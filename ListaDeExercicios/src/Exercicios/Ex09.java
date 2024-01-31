//Exercicio pediu para considerar US$1,00 = R$3,45
package Exercicios;

import java.util.Scanner;

public class Ex09 {
	public static void main(String args[]) {
		final double dollar = 3.45;
		double d;
		Scanner input = new Scanner(System.in);
		System.out.println("Quanto de dinheiro voce tem?");
		d = input.nextDouble();
		System.out.printf("Voce consegue comprar %.2f dollars", d/dollar);
	}
}
