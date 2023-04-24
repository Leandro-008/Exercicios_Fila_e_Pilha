package exercicio6;

public class Pilha {
    private int[] stack = new int[2000];
    private int top = -1;

    // Adiciona um elemento no topo da pilha
    public void push(int numero) {
        stack[++top] = numero;
    }

    // Retira e retorna o elemento do topo da pilha
    public int pop() {
        int numero = stack[top--];
        return numero;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return top == -1;
    }

    // Imprime o conteúdo da pilha
    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
