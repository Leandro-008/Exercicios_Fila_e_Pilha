package exercicio7;

public class InverterFilaComPilha {
    public static void inverterFila(Fila fila) {
        if (fila == null || fila.tamanho() == 0) {
            return;
        }

        Pilha pilha = new Pilha(fila.tamanho());

        // Esvazia a fila e coloca os elementos na pilha
        while (!fila.estaVazia()) {
            pilha.empilhar(fila.desenfileirar());
        }

        // Esvazia a pilha e coloca os elementos de volta na fila (invertendo a ordem)
        while (!pilha.estaVazia()) {
            fila.enfileirar(pilha.desempilhar());
        }
    }

}
    

