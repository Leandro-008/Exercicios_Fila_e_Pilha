package exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Pilha pilha = new Pilha(5);
    Scanner entrada = new Scanner(System.in);

    pilha.push(1);
    pilha.push(2);
    pilha.push(3);
    pilha.push(4);
    pilha.push(5);

    System.out.print("Digite o elemento a ser removido da pilha: ");
    int elemento = entrada.nextInt();
    entrada.close();

    Pilha pilha2 = new Pilha(pilha.tamanho());
    pilha2.removerItem(pilha, elemento);

    System.out.println("Pilha após remoção do elemento " + elemento + ":");

    while (!pilha.isEmpty()) {
        System.out.println(pilha.pop());
    }
    }
}
