package lista1_Helena;
import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = input.nextInt();
		
		if(numero % 2 == 0) {
			numero = numero + 5;
			System.out.println("O número digitado é par, então seu valor somado com 5 é igual a " + numero);
        } else {
        	numero = numero + 8;
            System.out.println("O número digitado é ímpar, então seu valor somado com 8 é igual a " + numero);
        }
		
	}
}
