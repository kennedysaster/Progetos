package aulaum;

import java.util.Scanner;


public class PrimeiroCodigo {
	
 public static void main (String[] args) {
	 
	 Scanner scan = new Scanner(System.in);
		String nome;
		String pai;
		String mae;
		
		System.out.println("Qual seu nome :");
			nome = scan.nextLine();
		System.out.println("Qual nome do seu pai :");
			pai = scan.nextLine();
		System.out.println("Qual nome da sua mãe :");
			mae = scan.nextLine();
			
				
		System.out.printf("Seu nome é , " + nome + ", nome de seu pai , " + pai + ", e seu pai é casado com sua mãe que se chama , " + mae);

		
 }
}