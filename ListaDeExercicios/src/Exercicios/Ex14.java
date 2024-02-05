package Exercicios;

import java.util.Scanner;

public class Ex14 {
	public static void main(String args[]) {
		double km, dia;
		Scanner input = new Scanner(System.in);
		System.out.println("Qual foi a quantidade de Km percorridos? ");
		km = input.nextDouble();
		System.out.println("Quantos dias voce usou o carro? ");
		dia = input.nextDouble();
		System.out.printf("Voce tera que pagar %.2f reais: ", (dia * 90) + (km * 0.20));
	}
}
