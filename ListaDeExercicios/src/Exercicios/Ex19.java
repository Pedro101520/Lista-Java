package Exercicios;

import java.util.Scanner;

public class Ex19 {
	public static void main(String args[]) {
		double n1, n2, media;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite duas notas: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		media = (n1 + n2) / 2;
		if(media >= 7) {
			System.out.println("Voce teve um bom aproveitamento, com nota: " + media);
		}else {
			System.out.println("Voce nao teve um bom aproveitamento, com nota: " + media);
		}
	}
}
