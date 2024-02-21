package Exercicios;

import java.util.Random;

public class Ex50 {
	public static void main(String args[]) {
		Random random = new Random();
		int num, acima = 0, div = 0;
		System.out.println("Números sorteados: ");
		for(int i = 1; i <= 20; i++) {
			num = random.nextInt(1, 11);
			if(num > 5)
				acima++;
			if(num % 3 == 0)
				div++;
			System.out.printf("%d  ", num);
		}
		System.out.println("\n" + acima + " números, estão acima de 5");
		System.out.println(div + " números, são divisíveis por 3");
	}
}

