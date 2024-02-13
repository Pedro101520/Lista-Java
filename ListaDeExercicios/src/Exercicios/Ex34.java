package Exercicios;

import java.util.Scanner;

public class Ex34 {
	
	static void imc(double peso, double alt) {
		double imc = peso / Math.pow(alt, 2);
		if(imc < 18.5) {
			System.out.println("Abaixo do peso");
		}else if(imc >= 18.5 && imc < 25) {
			System.out.println("Peso ideal");
		}else if(imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso");
		}else if(imc >= 30 && imc < 40) {
			System.out.println("Obesidade");
		}else {
			System.out.println("Obesidade mórbida");
		}
	}
	
	public static void main(String args[]) {
		double peso, alt;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu peso:  ");
		peso = input.nextDouble();
		System.out.println("Digite sua altura: ");
		alt = input.nextDouble();
		
		imc(peso, alt);
	}
}
