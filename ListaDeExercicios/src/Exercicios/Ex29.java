package Exercicios;

import java.util.Scanner;

public class Ex29 {
	
	static double aumento(int anos, double sal) {
		if(anos < 3) {
			return sal * 1.03;
		}else if(anos <= 3 && anos <= 10) {
			return sal * 1.125;
		}
		return sal * 1.20;
	}
	
	public static void main(String args[]) {
		String nome;
		double sal;
		int anos;
		Scanner inputStr = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = inputStr.nextLine();
		System.out.println("Digite o seu salário: ");
		sal = inputNum.nextDouble();
		System.out.println("Digite quantos anos você trabalha na empresa: ");
		anos = inputNum.nextInt();
		
		System.out.printf("%s, o reajuste do seu salário será de: %.2f", nome, aumento(anos, sal));
		
	}
}
