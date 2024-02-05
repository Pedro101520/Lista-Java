package Exercicios;

import java.util.Scanner;

public class Ex16_Desafio {
	public static  void main(String args[]) {
		int dia, ano;
		double rest;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos cigarros voce fuma por dia? ");
		dia = input.nextInt();
		System.out.println("Há quantos anos voce fuma? ");
		ano = input.nextInt();
		rest = (dia * 10)/60;
		System.out.printf("Voce ja perdeu %.2f dia de vida", (rest/24) * (ano * 365));
	}
}
