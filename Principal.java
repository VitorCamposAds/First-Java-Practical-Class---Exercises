package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> ListaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = teclado.nextInt();
		teclado.nextLine(); // consume newline character
		String nome;
		for(int i=0; i<qtd; i++) {
			System.out.println("Digite o nome " + (i+1) + ":");
			nome = teclado.nextLine();
			ListaNomes.add(nome);
		}
		
		System.out.println("Nomes digitados:");
		for(String n : ListaNomes) {
			System.out.println(n);
		}
		
		for(int i=ListaNomes.size()-1; i>=0;i--)
			System.out.println("Os nomes de trás para frente são:" + ListaNomes.get(i));		
		
	}

}
