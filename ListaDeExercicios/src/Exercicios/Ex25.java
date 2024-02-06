package Exercicios;

import java.util.Scanner;

public class Ex25 {
	public static void main(String args[]) {
		double v1, v2, v3;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor de 3 valores de reta: ");
		v1 = input.nextDouble();
		v2 = input.nextDouble();
		v3 = input.nextDouble();
		if(v1 < (v2 + v3) && v2 < (v1 + v3) && v3 < (v1 + v2)) {
			System.out.println("Os valores informados, são de um triângulo");
		}else {
			System.out.println("Os valores informados, não são de um triângulo");
		}
	}
}
