package lista1_Helena;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c;

		System.out.print("Digite um número para A: ");
		a = input.nextInt();
		
		System.out.print("Digite um número para B: ");
		b = input.nextInt();
		
		System.out.print("Digite um número para C: ");
		c = input.nextInt();
		
	     if(a > b && a > c) {
			if(b > c) {
				System.out.println(a + ", " + b + ", " + c);
			} else {
				System.out.println(a + ", " + c + ", " + b);
			}
		}
		else if(b > a && b > c) {
			if(a > c ) {
				System.out.println(b + ", " + a + ", " + c);
			}else {
				System.out.println(b + ", " + c + ", " + a);
			}
		} else {
			if(a > b) {
				System.out.println(c + ", " + a + ", " + b);
			}else {
				System.out.println(c + ", " + b + ", " + a);
			}
		}	
}
}