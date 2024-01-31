package Exercicios;

import java.util.Scanner;

public class Ex07 {
	public static void main(String args[]) {
		double num;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num = input.nextDouble();
		System.out.println("O dobro é: " + (num*2));
		System.out.println("A terça metade é: " + (num/3));
	}
}
