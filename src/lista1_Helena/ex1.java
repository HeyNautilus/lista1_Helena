package lista1_Helena;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        int a, b, c;
	        
	        System.out.print("Digite o valor de A: ");
	        a = input.nextInt();
	        
	        System.out.print("Digite o valor de B: ");
	        b = input.nextInt();
	        
	        System.out.print("Digite o valor de C: ");
	        c = input.nextInt();
	        
	        if (a + b < c) {
	            System.out.println("A soma de A + B é menor que C");
	        } else {
	            System.out.println("A soma de A + B é maior que C");
	        }
	       
	    }
	}


