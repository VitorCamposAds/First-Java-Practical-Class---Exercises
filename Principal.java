package empresa;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int palpite;
        int valorCorreto = 10_000; // Corrected the syntax for assigning a value to an int variable

        System.out.println("Qual o seu palpite? ");
        palpite = teclado.nextInt();

        while (palpite != valorCorreto) {
            if (palpite > valorCorreto) {
                System.out.println("Seu palpite está acima do número correto!");
            } 
            
            else {
                	System.out.println("Seu palpite está abaixo do número correto!");
            }
            System.out.println("Digite outro palpite:  "); // Added this line to ask for input again
            palpite = teclado.nextInt();
        }

        System.out.println("Você acertou!");
    }
}

