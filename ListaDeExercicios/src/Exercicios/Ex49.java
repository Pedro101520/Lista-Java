package Exercicios;

import java.util.Scanner;

public class Ex49 {
	public static void main(String args[]) {
		int num, i = 0, par = 0, impar = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Este programa verifica os numeros pares e ímpares");
		while(i < 6) {
			System.out.printf("Digite o %d numero: \n", i + 1);
			num = input.nextInt();
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			i++;
		}
		System.out.printf("Tem %d numeros pares e %d numeros ímpares", par, impar);
	}
}
