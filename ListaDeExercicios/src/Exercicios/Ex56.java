package Exercicios;

import java.util.Scanner;

public class Ex56 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		float num = 0, soma = 0;
		System.out.println("Digite uma sequência de números - Para encerrar digite 1111");
		while(flag) {
			num = input.nextFloat();
			if(num == 1111)
				flag = false;
			else
				soma += num;
		}
		System.out.println("O somátorio dos números é: " + soma);
	}
}
