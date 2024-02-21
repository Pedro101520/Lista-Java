package Exercicios;

import java.util.Scanner;

public class Ex53 {
	public static void main(String args[]) {
		int idade, soma = 0, maior = 0, menor = 0, mulher = 0;
		char s;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua idade e seu sexo: M/F");
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite a idade da %d pessoa: ", i + 1);
			idade = input.nextInt();
			System.out.printf("Digite o sexo da %d pessoa: ", i + 1);
			s = input.next().charAt(0);
			soma += idade;
			
			if(idade > 18)
				maior++;
			if(idade < 5)
				menor++;
			
			if(idade > 20 && s == 'F')
				mulher++;
			
		}
		System.out.println("A media de idades é: " + soma/5);
		System.out.println(maior + " pessoas tem mais de 18 anos");
		System.out.println(menor + " pessoas tem menos de 5 anos");
		System.out.println(mulher + " mulheres tem mais de 20 anos");
	}
}
