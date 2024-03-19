package Exercicios;

import java.util.Scanner;

public class Ex59 {
	public static void main(String args[]) {
		Scanner inputIdade = new Scanner(System.in);
		Scanner inputOpcao = new Scanner(System.in);
		boolean flag = true;
		int idade = 0, maiorIdade = 0, countHomem = 0, mediaHomem = 0, menorIdade = Integer.MAX_VALUE;
		char opcao;
		
		while(flag) {
			System.out.println("Digite sua idade: ");
			idade = inputIdade.nextInt();
			System.out.println("Digite seu sexo - M ou F");
			opcao = inputOpcao.nextLine().toLowerCase().charAt(0);
			
			if(idade > maiorIdade)
				maiorIdade = idade;
			if(opcao == 'm') {
				mediaHomem += idade;
				countHomem++;
			}
			if(opcao == 'f' && menorIdade < idade)
				menorIdade = idade;
			
			char continuar;
			System.out.println("Deseja continuar? S ou N");
			if(continuar == 's')
			
		}
		System.out.println("A maior idade lida foi: " + maiorIdade);
		System.out.printf("Foram cadastrados: %d homens", countHomem);
		System.out.printf("A mulher mais jovem, tem %d anos", menorIdade);
		System.out.println("A idade média dos homens é de: " + mediaHomem/countHomem);

	}
}
