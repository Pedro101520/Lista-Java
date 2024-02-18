package Exercicios;

import java.util.Scanner;

public class Ex45 {
	
	static void maior(int num, int unum, int inc) {
		System.out.println("Primeiro numero maior - Contagem Regressiva");
		while(num >= unum) {
			System.out.println(num);
			num -= inc;
		}
		System.out.println("Acabou!");
	}
	
	 public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);
		 int num, unum, inc;
		 System.out.println("Digite o primeiro valor: ");
		 num = input.nextInt();
		 System.out.println("Digite o ultimo valor: ");
		 unum = input.nextInt();
		 System.out.println("Digite o incremento: ");
		 inc = input.nextInt();
		 
		 if(num >= unum) {
			 maior(num, unum, inc);
		 }else {
			 while(num <= unum) {
				System.out.println(num);
				num += inc;
			 }
			 System.out.println("Acabou!");
		 }
	 }
}
