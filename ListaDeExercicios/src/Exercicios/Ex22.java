package Exercicios;

import java.util.Scanner;

public class Ex22 {
	public static void main(String args[]) {
		int ano, idade;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o seu ano de nascimento: ");
		ano = input.nextInt();
		idade = 2024 - ano;
		if(idade < 18) {
			System.out.printf("Faltam %d anos para o seu alistamento: ", 18 - idade);
		}else if(idade > 18) {
			System.out.printf("Ja se passaram %d anos que voce se alistou", idade - 18);
		}else {
			System.out.println("Voce vai se alistar esse ano");
		}
	}
}
