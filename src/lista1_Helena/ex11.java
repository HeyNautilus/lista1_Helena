package lista1_Helena;

import java.util.Scanner;

public class ex11 {
	public void capturaDados() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu código: ");
		String codAluno = input.nextLine();

		System.out.print("Digite sua nota 1: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Digite sua nota 2: ");
		double nota2 = input.nextDouble();
		
		System.out.print("Digite sua nota 3: ");
		double nota3 = input.nextDouble();
	
		System.out.print("Digite sua ME: ");
		double ME = input.nextDouble();
		
		double MA = (nota1 + nota2 * 2 + nota3 * 3 + ME)/7;
		String resultadoNota = this.Mencao(MA);
		
		if((MA >= 60)) {
			System.out.println("O aluno "+ codAluno+ " com nota " + MA +" foi aprovado com menção " + resultadoNota);
		} else {
			System.out.println("O aluno"+ codAluno+ "com nota" + MA +" foi reprovado com menção" + resultadoNota);
		}
}
	 public String Mencao(double nota) {
		 if (nota >= 90) {
			 return "A";
		 }
		 else if (nota >= 75) {
			 return "B";
		 }
		 else if (nota >= 60) {
			 return "C";
		 }
		 else if (nota >= 40) {
			 return "D";
		 }else {
			 return "E";
		 }
	}
	 
	public static void main(String[] args) {
		ex11 objeto = new ex11();
		objeto.capturaDados();
	}
}

