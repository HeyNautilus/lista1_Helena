package lista1_Helena;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	 System.out.print("Digite seu nome: ");
     String nome = input.next();
     
     System.out.print("Digite seu sexo F ou M: ");
     String sexo = input.next();
     
     System.out.print("Digite seu estado civil: ");
     String civil = input.next();
     
     
     if(sexo.equals("F") && civil.equals("Casada")) {
    	 System.out.print("Digite quantos anos de casamento: ");
    	 int anos = input.nextInt();
     } 
	}
}
