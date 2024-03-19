package Exercicios;

import java.util.Scanner;

public class Ex58 {
	public static void main(String args[]) {
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		int media = 0, idade = 0, count = 0;
		System.out.println("Digite as idades, para parar digite 999");
		while(flag) {
			idade = input.nextInt();
			if(idade == 999)
				flag = false;
			else {
				count++;
				media += idade;		
			}
		}
		System.out.printf("Tem %d alunos na sala", count);
		System.out.printf("\n A média de idade da turma é de: %d", media/count);
	}
}
