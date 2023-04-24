package exercicio1;
//Exercício 1

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Pilha p1 = new Pilha(0);

    System.out.println("Digite um texto: ");
    String texto = entrada.nextLine();

    entrada.close();

    System.out.println("O texto escrito na ordem inversa fica: " + p1.inverterTexto(texto));

    System.out.println(p1.verificarPalindromo(texto));

    }
}
