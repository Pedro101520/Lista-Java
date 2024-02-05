package Exercicios;

import java.util.Scanner;

public class Ex18 {
	public static void main(String args[]) {
		int ano;
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a sua data de nascimento: ");
		ano = input.nextInt();
		if(2024 - ano >= 16) {
			System.out.println("Voce pode votar");
		}else {
			System.out.println("Voce nao pode votar");
		}
	}
}
