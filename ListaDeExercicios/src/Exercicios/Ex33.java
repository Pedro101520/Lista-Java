package Exercicios;

import java.util.Scanner;

public class Ex33 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double casa, sal, anos, valor;
		System.out.println("Qual o valor da casa? ");
		casa = input.nextDouble();
		System.out.println("Qual é o seu salário? ");
		sal = input.nextDouble();
		System.out.println("Em quantos anos você quer parcelar? ");
		anos = input.nextDouble();
		
		valor = casa / (anos * 12);
		if(valor > (sal * 0.30)) {
			System.out.println("Seu empréstimo não foi aprovado");
		}else {
			System.out.println("Seu empréstimo foi aprovado");
		}
	}
}
