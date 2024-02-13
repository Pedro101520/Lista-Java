package Exercicios;

public class Ex43 {
	public static void main(String args[]) {
		int i = 30;
		while(i >= 0) {
			if(i % 4 == 0)
				System.out.printf("[%d] \n", i);
			else
				System.out.println(i);
			i--;
		}
		System.out.println("Acabou!");
	}
}
