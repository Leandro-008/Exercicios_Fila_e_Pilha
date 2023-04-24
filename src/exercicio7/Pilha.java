package exercicio7;

public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1;
    }

    public void empilhar(int valor) {
        if (topo == elementos.length - 1) {
            throw new IllegalStateException("Pilha está cheia");
        }

        topo++;
        elementos[topo] = valor;
    }

    public int desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha está vazia");
        }

        int valor = elementos[topo];
        topo--;
        return valor;
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}