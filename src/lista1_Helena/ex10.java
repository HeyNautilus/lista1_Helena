package lista1_Helena;
import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		
		
        System.out.print("Digite o valor do produto: ");
        double valorProduto = input.nextDouble();
        
        System.out.print("Digite a forma de pagamento(dinheiro, cheque, credito, dividido): ");
        String pagamento = input.next();
        
        if(pagamento.equals("dinheiro") || pagamento.equals("cheque")) {
        	valorProduto = valorProduto * 0.9; 
        	System.out.println("Você obteve 10% de desconto, seu produto saiu por " + valorProduto);
        }
        else if(pagamento.equals("crédito")) {
        	valorProduto = valorProduto * 0.85; 
        	System.out.println("Você obteve 15% de desconto, seu produto saiu por " + valorProduto);
        } else {
        	if(pagamento.equals("dividido em duas vezes") || pagamento.equals("dividido"))  {
        	valorProduto = valorProduto * 1.10;
        	System.out.println("A forma de pagamento acrescenta 10% de juros, eu produto saiu por " + valorProduto);
        }
        }
	}
}
