package fundamentos.exercicios;

/* 3. Criar um programa que leia o peso e a altura do usu�rio e imprima no console o IMC. */

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso:");
		double peso = sc.nextDouble();
		
		System.out.println("Digite a altura:");
		double altura = sc.nextDouble();
		
		double imc = peso / ( altura * altura );
		
		System.out.print("IMC: " + imc);
		
		sc.close();
	}
}
