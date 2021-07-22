

//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

package ex4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args){
	
			Scanner in = new Scanner (System.in);
			
			double nota1, nota2, nota3, nota4;
			int media = 4;
			
			System.out.println("Digite a primeira nota bimestral");
			nota1 = in.nextDouble();
	
			System.out.println("Digite a segunda nota bimestral");
			nota2 = in.nextDouble();
			
			System.out.println("Digite a terceira nota bimestral");
			nota3 = in.nextDouble();
			
			System.out.println("Digite a quarta nota bimestral");
			nota4 = in.nextDouble();
			
			double soma = nota1 + nota2 + nota3 + nota4;
			double resultado = soma/media;
			
			System.out.println("Sua média é:" +resultado);
			
			
	{
		
			if (resultado >= 6) {
			System.out.println ("Aprovado!");
			
			} else {
				System.out.println ("Reprovado!");
			}
			}
	}
}
