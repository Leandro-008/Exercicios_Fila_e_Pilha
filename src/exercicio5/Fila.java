package exercicio5;

public class Fila {
    private int[] fila = new int[1000];
    private int front = 0;
    private int rear = -1;
    private int tamanho = 0;

    public void offer(int numero) {
        if (rear == 999) {
            rear = -1;
        }
        fila[++rear] = numero;
        tamanho++;
    }

    public boolean contains(int numero) {
        for (int i = front; i <= rear; i++) {
            if (fila[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public void printfila() {
        for (int i = front; i <= rear; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println();
    }
}

