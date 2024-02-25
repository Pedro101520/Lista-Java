package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex55_Desafio {
	public static void main(String args[]) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int numAlt = random.nextInt(1, 11);
		System.out.println(numAlt);
		int num = 0, tent = 0;
		System.out.println("Numero de 1 a 10, você terá 4 tentativas");
		while(num != numAlt && tent != 4) {
			System.out.printf("Tentativa %d: ", tent + 1);
			num = input.nextInt();
			tent++;
		}
		if(tent == 4)
			System.out.println("Não foi dessa vez");
		else
			System.out.printf("Você acertou, com %d tentativas", tent);
	}
}
