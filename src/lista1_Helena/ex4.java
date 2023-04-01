package lista1_Helena;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A, B, C;

		System.out.print("Digite um número para A: ");
		A = input.nextInt();
		
		System.out.print("Digite um número para B: ");
		B = input.nextInt();
		
		if(A == B) {
			System.out.println("A e B são iguais");
        } else {
        	C = A * B;
        	System.out.println("O produto de A e B é " + C);
        }

	}

}
