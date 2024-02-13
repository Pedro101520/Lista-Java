package Exercicios;

import java.util.Scanner;

public class Ex42 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num, i = 1;
		System.out.println("Digite um numero: ");
		num = input.nextInt();
		while(i <= num) {
			System.out.println(i);
			i++;
		}
		System.out.println("Acabou!");
	}
}
