package Exercicios;

import java.util.Scanner;

public class Ex44 {
	 public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);
		 int num, unum, inc;
		 System.out.println("Digite o primeiro valor: ");
		 num = input.nextInt();
		 System.out.println("Digite o ultimo valor: ");
		 unum = input.nextInt();
		 System.out.println("Digite o incremento: ");
		 inc = input.nextInt();
		 
		 while(num <= unum) {
			 System.out.println(num);
			 num += inc;
		 }
		 System.out.println("Acabou!");
	 }
}
