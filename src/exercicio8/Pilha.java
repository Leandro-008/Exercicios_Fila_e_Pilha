package exercicio8;

public class Pilha {
    private int[] pilha;
    private int topo;

    public Pilha() {
        pilha = new int[1000];
        topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public void push(int item) {
        pilha[++topo] = item;
    }

    public int pop() {
        return pilha[topo--];
    }
}

