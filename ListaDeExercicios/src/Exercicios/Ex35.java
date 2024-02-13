package Exercicios;

import java.util.Scanner;

public class Ex35 {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int model, dias;
		double km, aluguel = 0;
		System.out.println("1 - Carro popular, 2 - Carro de Luxo: ");
		model = input.nextInt();
		System.out.println("Quantos dias de aluguel? ");
		dias = input.nextInt();
		System.out.println("Quantos Km rodados? ");
		km = input.nextDouble();
		
		switch(model) {
		case 1: 
			if(km < 100)
				aluguel = (dias * 90) + (km * 0.20);
			else
				aluguel = (dias * 90) + (km * 0.10);
		break;
		case 2:
			if(km < 200)
				aluguel = (dias * 150) + (km * 0.30);
			else
				aluguel = (dias * 150) + (km * 0.25);
		break;
		default:
			System.out.println("Opção de carro inválido");
		}
		
		System.out.println("O aluguel do seu carro será de: " + aluguel);
	}
}
