package Exercicios;

import java.util.Scanner;

public class Ex04 {
	
	static double soma(double num, double num1) {
		return num + num1;
	}
	
	public static void main(String args[]) {
		double num, num1;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite dois numeros: ");
		num = input.nextDouble();
		num1 = input.nextDouble();
		System.out.println("A soma entre os valores e: " + soma(num, num1));
	}
}
