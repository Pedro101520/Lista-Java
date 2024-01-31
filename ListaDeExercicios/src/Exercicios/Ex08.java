package Exercicios;

import java.util.Scanner;

public class Ex08 {
	public static void main(String args[]) {
		double metros;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor em Metros: ");
		metros = input.nextDouble();
		System.out.println("O valor em Km é: " + metros/1000);
		System.out.println("O valor em Hm é: " + metros/100);
		System.out.println("O valor em Dam é: " + metros/10);
		System.out.println("O valor em Dm é: " + metros*10);
		System.out.println("O valor em Cm é: " + metros*100);
		System.out.println("O valor em mm é: " + metros*1000);
	}
}
