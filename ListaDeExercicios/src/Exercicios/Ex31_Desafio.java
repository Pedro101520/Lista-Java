package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex31_Desafio {
	
	static void verifica(int opcao, int numAlt) {
		if((opcao - 1) == numAlt) {
			System.out.println("Empate");
		}else if((opcao == 1 && numAlt == 2) || (opcao == 2 && numAlt == 0) || (opcao == 3 && numAlt == 1)) {
			System.out.println("Você ganhou");
		}else {
			System.out.println("Você perdeu");
		}
	}
	
	public static void main(String args[]) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int opcao;
		String opcoes[] = {"pedra", "papel", "tesoura"};
		int numAlt = random.nextInt(3);
		
		System.out.println("Digite 1 - Pedra, 2 - Papel e 3 - Tesoura");
		opcao = input.nextInt();
		
		verifica(opcao, numAlt);
	}
}
