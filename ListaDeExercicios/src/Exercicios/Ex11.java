package Exercicios;

import java.util.Scanner;

public class Ex11 {
	public static void main(String args[]) {
		double a, b, c, delta;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a = input.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = input.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = input.nextDouble();
		delta = Math.pow(b, 2) - 4 * (a * c);
		System.out.printf("O valor de delta e: %.2f", delta);
	}
}
