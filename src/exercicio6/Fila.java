package exercicio6;

public class Fila {
    private int[] queue = new int[2000];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    // Adiciona um elemento no final da fila
    public void offer(int numero) {
        if (rear == 1999) {
            rear = -1;
        }
        queue[++rear] = numero;
        size++;
    }

    // Retira o elemento do início da fila
    public int poll() {
        int numero = queue[front++];
        if (front == 2000) {
            front = 0;
        }
        size--;
        return numero;
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return size == 0;
    }
}
