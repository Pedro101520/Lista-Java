package Exercicios;

import java.util.Scanner;

public class Ex05 {
	public static void main(String args[]) {
		double nota1, nota2;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite as duas notas: ");
		nota1 = input.nextDouble();
		nota2 = input.nextDouble();
		System.out.println("A sua media foi: " + (nota1 + nota2) / 2);
	}
}
