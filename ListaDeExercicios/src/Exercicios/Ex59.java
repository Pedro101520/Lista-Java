package Exercicios;

import java.util.Scanner;

public class Ex59 {
	public static void main(String args[]) {
		Scanner inputIdade = new Scanner(System.in);
		Scanner inputOpcao = new Scanner(System.in);
		boolean flag = true;
		int idade = 0, maiorIdade = 0, countHomem = 0, menorIdade = Integer.MAX_VALUE;
		float mediaHomem = 0;
		char opcao, continuar;
		
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
			if(opcao == 'f' && idade < menorIdade)
				menorIdade = idade;
			
			System.out.println("Deseja continuar? S ou N");
			continuar = inputOpcao.nextLine().charAt(0);
			if(continuar == 'n')
				flag = false;
			
		}
		System.out.println("A maior idade lida foi: " + maiorIdade);
		System.out.printf("Foram cadastrados: %d homens", countHomem);
		System.out.printf("\nA mulher mais jovem, tem %d anos", menorIdade);
		System.out.println("\nA idade média dos homens é de: " + mediaHomem/countHomem);

	}
}
