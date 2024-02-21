package Exercicios;

import java.util.Scanner;

public class Ex54 {
	public static void main(String args[]) {
		double peso, altura, soma = 0, maisKg = 0, menosAP = 0, maisAP = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o peso e a altura de 7 pessoas: ");
		for(int i = 0; i < 7; i++) {
			System.out.printf("Digite o peso da %d pessoa: ", i + 1);
			peso = input.nextDouble();
			System.out.printf("Digite a altura da %d pessoa: ", i + 1);
			altura = input.nextDouble();
			
			soma += altura;
			if(peso > 90)
				maisKg++;
			if(peso < 50 && altura < 1.60)
				menosAP++;
			if(peso > 100 && altura > 1.90)
				maisAP++;
		}
		System.out.println(soma);
		System.out.printf("A média de altura foi: %.2f%n", soma/7);
		System.out.println(maisKg + " pessoas pesam mais que 90Kg");
		System.out.println(menosAP + " pessoas pesam menos que 50Kg e tem menos que 1,60m");
		System.out.println(maisAP + " pessoas pesam mais que 100Kg e tem mais de 1,90m");
	}
}
