package executavel;

import java.util.Locale;
import java.util.Scanner;

import classes.Quarto;

public class Principal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoasa serão digitadas? ");
		int numero = sc.nextInt();
		
		String[] nomes = new String[numero];
		int[] idades = new int[numero];
		double[] alturas = new double[numero];
		
		for(int i = 0; i < numero; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		// --------- MEDIA DAS ALTURAS --------
		double soma = 0.0;
		
		for(int i = 0; i < numero; i++) {
			soma = soma + alturas[i];
		}
		
		double mediaAlturas = soma / numero;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAlturas);
	
		
		// --------- Porcentagem (Pessoas com menos de 16 anos)----------
		int contar = 0;
		
		for(int i = 0; i < numero; i++) {
			if(idades[i] < 16) {
				contar = contar + 1;
			}
		}
		double porcentagem = contar * 100.0 / numero;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem );
		
		// ------------ Imprimir pessoas -----------------
		for(int i = 0; i < numero; i++) {
			if(idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}
	
}
