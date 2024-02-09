package Exercicios;

import java.util.Scanner;

public class Ex27 {
	
	static void result(double media) {
		if(media <= 4.9) {
			System.out.println("Reprovado com nota: " + media);
		}else if(media >= 5 && media <= 6.9) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Aprovado com nota: " + media);
		}
	}
	
	public static void main(String args[]) {
		double num, num1, media;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite duas notas: ");
		num = input.nextDouble();
		num1 = input.nextDouble();
		media = (num + num1) / 2;
		result(media);
	}
}
