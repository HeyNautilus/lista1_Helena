package lista1_Helena;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		 
	boolean a, b;
		  
	System.out.print("Digite true ou false para A: ");
		a = input.nextBoolean();
			
    System.out.print("Digite true ou false para B: ");
		b = input.nextBoolean();
			
		if (a && b) {
	     System.out.println("Ambos são VERDADEIROS");
	    } else if (!a && !b) {
	      System.out.println("Ambos são FALSOS");
	    } else {
	      System.out.println("Um é VERDADEIRO e outro é FALSO");
	        }
	    }
	
}

