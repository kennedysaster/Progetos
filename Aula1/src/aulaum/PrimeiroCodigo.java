package aulaum;

import java.util.Scanner;

public class mediaaluno {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/* declarando as notas */

		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		String nome = "";

		System.out.println("Digite o nomo do Aluno : " + nome);
		nome = scan.nextLine();
		System.out.println("-------------------------------------------");
		System.out.println("Nota Primeiro Bimeste do Aluno : " + nome);
		nota1 = scan.nextDouble();
		System.out.println("-------------------------------------------");
		System.out.println("Nota Segundo Bimeste do Aluno : " + nome);
		nota2 = scan.nextDouble();
		System.out.println("-------------------------------------------");
		System.out.println("Nota Terceiro Bimeste do Aluno : " + nome);
		nota3 = scan.nextDouble();
		System.out.println("-------------------------------------------");
		System.out.println("Nota Quarto Bimeste do Aluno : " + nome);
		nota4 = scan.nextDouble();
		System.out.println("---------------Resultado----------------------------");
		double soma = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Boletim do aluno resumo---------------------------------");
		System.out.printf("Soma das notas do aluno " + nome + ", " + "Nota :" + soma);
		
		String reprovado = "Reprovado";
		String aprovado = "Aprovado";
		
		if (soma >= 5.1) {
			System.out.println(" : " + aprovado);
		}
			
			if ((soma >= 4) && (soma <= 5)) {
				System.out.println(":" + "Em recuperação");
			
			}
				if ((soma <4))
					System.out.println(": "+ " Reprovado");
			}
	}
