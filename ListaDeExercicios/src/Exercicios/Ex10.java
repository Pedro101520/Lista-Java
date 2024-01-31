package Exercicios;

import java.util.Scanner;

public class Ex10 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double alt, larg, area;
		System.out.println("Digite a altura da parede: ");
		alt = input.nextDouble();
		System.out.println("Digite a largura da parede: ");
		larg = input.nextDouble();
		area = alt*larg;
		System.out.printf("A parede tem %.2f e precida de %.2f litros de tinta", area, area/2);
	}
}
