package exercicio2;

public class Pilha {
    private int[] pilha;
    private int topo;
    private int tamanho;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        pilha = new int[tamanho];
        topo = -1;
    }

    public void push(int item) {
        if (topo == tamanho - 1) {
            System.out.println("Pilha cheia! Não é possível empilhar o item: " + item);
        } else {
            pilha[++topo] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia! Não é possível desempilhar.");
            return -1;
        } else {
            return pilha[topo--];
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int tamanho() {
        return topo + 1;
    }

    public Pilha removerItem(Pilha p1, int chave){
        Pilha auxiliar = new Pilha(p1.tamanho()); // Pilha auxiliar para armazenar os itens temporariamente

        // Desempilhar os itens da pilha original e empilhá-los na pilha auxiliar até encontrar o item com a chave fornecida
        while (!p1.isEmpty()) {
            int item = p1.pop();
            if (item == chave) {
                break; // Item encontrado, interromper o laço
            } else {
                auxiliar.push(item); // Item não encontrado, empilhar na pilha auxiliar
            }
        }

        // Desempilhar os itens da pilha auxiliar e empilhá-los novamente na pilha original
        while (!auxiliar.isEmpty()) {
            p1.push(auxiliar.pop());
        }

        return p1; // Retornar a pilha original sem o item removido
    }
}

