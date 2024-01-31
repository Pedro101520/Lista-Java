package Exercicios;

import java.util.Scanner;

public class Ex06 {
	public static void main(String args[]) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num = input.nextInt();
		System.out.printf("O sucessor do numero e: %d e o antecessor e: %d", num+1, num-1);
	}
}
