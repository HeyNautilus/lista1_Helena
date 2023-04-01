package lista1_Helena;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("Digite um número para A: ");
		int numero = input.nextInt();
		
		if(numero > 0) {
			numero = numero * 2;
			System.out.println("O número é positivo e seu dobro é " + numero);
		} else {
			numero = numero * 3;
			System.out.println("O número é negativo e seu triplo é " + numero);
		}
		
	}
}
