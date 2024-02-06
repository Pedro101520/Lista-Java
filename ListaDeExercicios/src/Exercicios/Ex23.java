package Exercicios;

import java.util.Scanner;

public class Ex23 {
	public static void main(String args[]) {
		String nome;
		char sexo;
		double valor;
		Scanner inputText = new Scanner(System.in); 
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Informe o seu nome: ");
		nome = inputText.nextLine();
		System.out.println("Informe o seu sexo (M/F): ");
		sexo = inputText.next().charAt(0);
		System.out.println("Informe o valor da sua compra: ");
		valor = inputNum.nextDouble();
		switch(sexo) {
		case 'M': System.out.printf("Valor com desconto: %.2f", valor *= 0.95);; 
		break;
		case 'F': System.out.printf("Valor com desconto: %.2f", valor *= 0.87);; 
		break;
		default: System.out.println("Opção inválida");
		}
	}
}
