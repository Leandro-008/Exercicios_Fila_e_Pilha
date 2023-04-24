package exercicio7;

public class Fila {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        elementos = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void enfileirar(int valor) {
        if (tamanho == elementos.length) {
            throw new IllegalStateException("Fila está cheia");
        }

        fim = (fim + 1) % elementos.length;
        elementos[fim] = valor;
        tamanho++;
    }

    public int desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("Fila está vazia");
        }

        int valor = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valor;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public int[] getElementos() {
        return elementos;
    }
}
