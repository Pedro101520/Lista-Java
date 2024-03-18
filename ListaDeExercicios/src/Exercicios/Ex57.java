package Exercicios;

import java.util.Scanner;

public class Ex57 {
	public static void main(String args[]) {
		Scanner inputSal = new Scanner(System.in);
		Scanner inputSexo = new Scanner(System.in);
		
		boolean flag = true;
		float sal = 0, salHomem = 0, salMulher = 0;
		char opcao;
		while(flag) {
			System.out.println("Digite o salário do funcionário: ");
			sal = inputSal.nextFloat();
			System.out.println("Digite o sexo do funcionário (M ou F): ");
			opcao = inputSexo.nextLine().charAt(0);
			
			if(Character.toLowerCase(opcao) == 'm')
				salHomem += sal;
			else
				salMulher += sal;
			
			System.out.println("Deseja continuar digitando dados? S ou N");
			opcao = inputSexo.nextLine().charAt(0);
			if(Character.toLowerCase(opcao) == 'n')
				flag = false;
		}
		
		System.out.println("O salário dos homens é: " + salHomem);
		System.out.println("O salário das mulheres é: " + salMulher);
	}
}
