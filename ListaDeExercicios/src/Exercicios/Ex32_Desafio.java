package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex32_Desafio {
	public static void main(String args[]) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int numAlt = random.nextInt(1, 6);
		int num = 0, tent = 0;
		System.out.println("Numero de 1 a 5");
		while(num != numAlt) {
			System.out.println("Digite um numero, até acertar: ");
			num = input.nextInt();
			tent++;
		}
		System.out.printf("Você acertou, com %d tentativas", tent);
	}
}
