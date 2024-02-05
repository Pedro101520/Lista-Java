package Exercicios;

import java.util.Scanner;

public class Ex17 {
	public static void main(String args[]) {
		double km;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a velocidade do carro: ");
		km = input.nextDouble();
		if(km > 80)
			System.out.printf("Você foi multado em: %.2f", (km - 80) * 5);
	}
}
