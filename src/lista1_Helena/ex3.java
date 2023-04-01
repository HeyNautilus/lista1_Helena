package lista1_Helena;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = input.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é impar.");
        }
		
	}
}
	
