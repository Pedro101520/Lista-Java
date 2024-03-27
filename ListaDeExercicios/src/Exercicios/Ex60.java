package Exercicios;

import java.util.Scanner;

public class Ex60 {
	
	public static char opcao() {
		Scanner inputStr = new Scanner(System.in);
        char opcao;
        System.out.println("Qual o seu sexo - M ou F");
        opcao = inputStr.next().charAt(0);
        opcao = Character.toLowerCase(opcao);
        return opcao;
	}
	
	public static 
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		int i = 0, idade, maiorIdade = 0, menorIdade = Integer.MAX_VALUE;
		String[] nomes = new String[i];
		boolean flag = true;
		
		while(flag) {
			char opcao = opcao();
			
			System.out.println("Qual é o seu nome?");
			String nome = inputStr.nextLine();
			nomes[i] = nome;
			
			System.out.println("Qual é sua idade: ");
			idade = input.nextInt();
			
			System.out.println("Deseja continuar? S ou N");
			opcao = inputStr.next().charAt(0);
			opcao = Character.toLowerCase(opcao);
			
			if(maiorIdade < idade)
				maiorIdade = idade;
			if(menorIdade > idade) {
				menorIdade = idade;
			}
			
			if(opcao == 'n')
				flag = false;
			i++;
		}
		
		System.out.println("A maior idade é: " + maiorIdade);
	}
}
