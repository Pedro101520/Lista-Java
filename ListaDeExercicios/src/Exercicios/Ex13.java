package Exercicios;

import java.util.Scanner;

public class Ex13 {
	public static void main(String args[]) {
		double sal;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o seu salario: ");
		sal = input.nextDouble();
		System.out.printf("O seu novo salario e: %.2f", (sal * 1.15));
	}
}
