package Exercicios;

import java.util.Scanner;

public class Ex51 {
	public static void main(String args[]) {
		double valor[] = new double[8];
		double numMaior, numMenor;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 8; i++) {
			System.out.printf("Digite o %d numero: ", i + 1);
			valor[i] = input.nextDouble();
		}
		numMaior = valor[0];
		numMenor = valor[0];
		
		for(int i = 0; i < 8; i++) {
			if(valor[i] > numMaior)
				numMaior = valor[i];
			if(valor[i] < numMenor)
				numMenor = valor[i];
		}
		
		System.out.println("O maior valor é: " + numMaior);
		System.out.println("O menor valor é: " + numMenor);
	}
}
