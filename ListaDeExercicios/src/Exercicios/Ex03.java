package Exercicios;

import java.util.Scanner;

public class Ex03 {
	public static void main(String args[]) {
		String nome;
		double salario;
		Scanner entradaInt = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = entradaString.nextLine();
		System.out.println("Digite o seu salario: ");
		salario = entradaInt.nextDouble();
		
		System.out.printf("O funcionario %s tem um salario de %.2f em Janeiro", nome, salario);
		
	}
}
