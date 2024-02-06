package Exercicios;

import java.util.Scanner;

public class Ex24 {
	public static void main(String args[]) {
		double d;
		Scanner input = new Scanner(System.in);
		System.out.println("Qual a distância em Km, que você vai percorrer? ");
		d = input.nextDouble();
		d = d > 200 ? d*0.45 : d*0.50;
		System.out.printf("O valor da sua passagem sera de: %.2f", d);
			
	}
}
