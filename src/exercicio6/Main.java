package exercicio6;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        // Sorteio de 2000 números aleatórios (1000 positivos e 1000 negativos)
        Random random = new Random();
        for (int i = 0; i < 2000; i++) {
            int numeroSorteado = random.nextInt(2001) - 1000; // Sorteia números de -1000 a 1000
            fila.offer(numeroSorteado); // Insere na fila
        }

        // Processamento da fila
        while (!fila.isEmpty()) {
            int numero = fila.poll(); // Retira o número do início da fila

            if (numero >= 0) {
                pilha.push(numero); // Empilha números positivos
            } else {
                if (!pilha.isEmpty()) {
                    int numeroTopoPilha = pilha.pop(); // Desempilha e imprime números negativos
                    System.out.println("Número negativo retirado do topo da pilha: " + numeroTopoPilha);
                }
            }
        }

        // Impressão da pilha
        System.out.println("Pilha:");
        pilha.printStack();
    }
}
