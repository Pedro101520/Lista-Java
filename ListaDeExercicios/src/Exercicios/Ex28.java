package Exercicios;

import java.util.Scanner;

public class Ex28 {
	
	static void terreno(double metro) {
		if(metro < 100) {
			System.out.printf("Seu terreno é Popular, com %.2f metros", metro);
		}else if(metro >= 100 && metro <= 500) {
			System.out.printf("Seu terreno é Master, com %.2f metros", metro);
		}else {
			System.out.printf("Seu terrno é Vip, com %.2f metros:", metro);
		}
	}
	
	public static void main(String args[]) {
		double alt, larg, metro;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a largura do seu terreno: ");
		larg = input.nextDouble();
		System.out.println("Digite a altura do seu terreno: ");
		alt = input.nextDouble();
		metro = alt * larg;
		terreno(metro);
	}
}
