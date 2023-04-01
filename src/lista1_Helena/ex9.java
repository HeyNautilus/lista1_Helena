package lista1_Helena;
import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite sua altura: ");
		float altura = input.nextFloat();
		
		System.out.print("Digite seu peso: ");
		float peso = input.nextFloat();
		
		if(peso / (altura * altura) < 18.5) {
			System.out.println("Abaixo do peso");
		}
		else if(peso / (altura * altura) >= 18.5 && peso / (altura * altura) <= 25) {
			System.out.println("Peso normal");
		}
		else if(peso / (altura * altura) > 25 && peso / (altura * altura) <= 30 ) {
			System.out.println("Acima do peso");
		} else {
			if(peso / (altura * altura) > 30) {
				System.out.println("Obeso");
			}
		}
		
}
	}


