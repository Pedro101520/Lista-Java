package Exercicios;

import java.util.Scanner;

public class Ex48 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int i = 0, soma = 0, numeros;
		System.out.println("Este programa calcula a somátoria entre 7 números");
		while(i <= 7) {
			System.out.printf("Digite o %d numero: \n", i);
			numeros = input.nextInt();
			soma += numeros;
			i++;
		}
		System.out.println("A somatoria dos números é: " + soma);
	}
}
