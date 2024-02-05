package Exercicios;

import java.util.Scanner;

public class Ex15 {
	public static void main(String args[]) {
		double dia;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o numero de dias trabalhados no mes: ");
		dia = input.nextDouble();
		System.out.printf("Seu salario sera: %.2f", (8 * 25) * dia);
	}
}
