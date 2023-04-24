package exercicio5;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Fila filaF = new Fila();
        Pilha pilhaP = new Pilha();

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int numeroSorteado = random.nextInt(1000) + 1; 
            if (!filaF.contains(numeroSorteado)) {
                filaF.offer(numeroSorteado);
            } else {
                pilhaP.push(numeroSorteado); 
            }
        }

        System.out.println("Fila F:");
        filaF.printfila();

        System.out.println("Pilha P:");
        pilhaP.printStack();
    }
}
