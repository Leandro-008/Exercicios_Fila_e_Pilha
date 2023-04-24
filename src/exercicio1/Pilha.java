package exercicio1;
//Exercício 1

public class Pilha {    
    private char[] pilha;
    private int topo;

    public Pilha(int capacidade) {
        this.pilha = new char[capacidade];
        this.topo = -1;
    }

    public void push(char c) {
        this.pilha[++topo] = c;
    }

    public char pop() {
        return this.pilha[topo--];
    }

    public boolean isEmpty() {
        return this.topo == -1;
    }

    public boolean isFull() {
        return this.topo == pilha.length - 1;
    }

    public String inverterTexto(String texto){
        Pilha pilha = new Pilha(texto.length());

        // Empilhar os caracteres do texto
        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        // Desempilhar os caracteres e anexá-los ao StringBuilder
        while (!pilha.isEmpty()) {
            sb.append(pilha.pop());
        }

        return sb.toString();
    }

    public String verificarPalindromo(String texto){
        Pilha pilha = new Pilha(texto.length());

        // Empilhar os caracteres do texto
        for (int i = 0; i < texto.length(); i++) {
            pilha.push(Character.toLowerCase(texto.charAt(i))); // Converter para minúsculo
        }

        // Desempilhar os caracteres e compará-los com o texto original
        for (int i = 0; i < texto.length(); i++) {
            if (Character.toLowerCase(texto.charAt(i)) != pilha.pop()) {
                return("O texto não é um Palindromo.");// Se os caracteres não forem iguais, não é palíndromo
            }
        }
        return("O texto é um Palindromo."); // Se todos os caracteres forem iguais, é palíndromo
    }
}

