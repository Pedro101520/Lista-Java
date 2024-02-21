package Exercicios;

import java.util.Scanner;

public class Ex52 {
	public static void main(String args[]) {
		double valor[] = new double[10];
		double numMaior, soma = 0, maior = 0, menor = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite a %d idade: ", i + 1);
			valor[i] = input.nextDouble();
			soma += valor[i];
			if(valor[i] > 18)
				maior++;
			if(valor[i] < 5)
				menor++;
		}
		numMaior = valor[0];
		
		for(int i = 0; i < 8; i++) {
			if(valor[i] > numMaior)
				numMaior = valor[i];
		}
		System.out.println("A media das idades é: " + soma/10);
		System.out.println(maior + " pessoas tem mais que 18 anos");
		System.out.println(menor + " pessoas tem menos que 5 anos");
		System.out.println("O maior valor é: " + numMaior);
	}
}
