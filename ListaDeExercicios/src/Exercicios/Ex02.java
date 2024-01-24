package Exercicios;

import java.util.Scanner;

public class Ex02 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String nome;
		System.out.println("Digite o seu nome: ");
		nome = input.nextLine();
		System.out.printf("Olá %s, é um prazer te conhecer!", nome);
	}
}
