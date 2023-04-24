package exercicio5;

public class Pilha {
    private int[] stack = new int[1000];
    private int top = -1;

    public void push(int numero) {
        stack[++top] = numero;
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
