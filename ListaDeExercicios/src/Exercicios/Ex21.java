package Exercicios;

import java.util.Scanner;

public class Ex21 {
	public static void main(String args[]) {
		int ano;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		ano = input.nextInt();
		if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano é bissexto");
		}else {
			System.out.println("O ano não é bissexto");
		}
	}
}
