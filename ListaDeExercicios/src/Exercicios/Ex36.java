package Exercicios;

import java.util.Scanner;

public class Ex36 {
	
	static double pontos(double horas) {
		if(horas < 10 && horas > 0) {
			return horas * 2;
		}else if(horas >= 10 && horas < 20) {
			return horas * 5;
		}
		return horas * 10;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double horas, valor;
		System.out.println("Digite quantas horas você obteve este mês: ");
		horas = input.nextFloat();
		
		valor = pontos(horas) * 0.05;
		System.out.printf("Você obteve %.2f pontos, e faturou: %.2f reais", pontos(horas), valor);
	}

}
