package Exercicios;

import java.util.Scanner;

public class Ex20 {
	public static void main(String args[]) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num = input.nextInt();
		if(num % 2 == 0) {
			System.out.println("O numero e par");
		}else {
			System.out.println("O numero e impar");
		}
	}
}
