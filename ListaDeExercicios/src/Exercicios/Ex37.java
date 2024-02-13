package Exercicios;

import java.util.Scanner;

public class Ex37 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Scanner inputChar = new Scanner(System.in);
		double sal;
		char gen;
		int anos;
		System.out.println("Digite o seu salário atual: ");
		sal = input.nextDouble();	
		System.out.println("Digite seu gênero: M/F");
		gen = inputChar.next().toLowerCase().charAt(0);
		System.out.println("Digite a quantos anos você trabalha na empresa: ");
		anos = input.nextInt();
		
		switch(gen) {
		case 'f':
			if(anos < 15) {
				sal *= 1.05;
			}else if(anos >= 15 && anos < 20) {
				sal *= 1.12;
			}else {
				sal *= 1.23;
			}
		break;
		case 'm':
			if(anos < 20) {
				sal *= 1.03;
			}else if(anos >= 20 && anos < 30) {
				sal *= 1.13;
			}else {
				sal *= 1.25;
			}
		break;
		default:
			System.out.println("Opção inválida");
		}
		
		System.out.println("Seu novo salário será de: " + sal);
	}
}
