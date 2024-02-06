package Exercicios;

import java.util.Scanner;

public class Ex26 {
	public static void main(String args[]) {
		int num, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite dois numeros: ");
		num = input.nextInt();
		num2 = input.nextInt();
		if(num > num2) {
			System.out.println("O primeiro numero é maior");
		}else {
			System.out.println("O segundo numero é maior");
		}
	}
}
