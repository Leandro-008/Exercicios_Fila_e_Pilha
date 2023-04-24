package exercicio8;
import java.util.Random;

public class TestaPilha {
    private Pilha pilhaP;
    private Pilha pilhaN;

    public TestaPilha() {
        pilhaP = new Pilha();
        pilhaN = new Pilha();
    }

    public void sortearNumeros(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int num = random.nextInt(201) - 100; 
            if (num > 0) {
                pilhaP.push(num);
            } else if (num < 0) {
                pilhaN.push(num);
            } else if (num == 0) {
                if (!pilhaP.isEmpty() && !pilhaN.isEmpty()) {
                    System.out.println("Elemento retirado da Pilha P: " + pilhaP.pop());
                    System.out.println("Elemento retirado da Pilha N: " + pilhaN.pop());
                } else {
                    System.out.println("As pilhas estão vazias.");
                }
            }
        }
    }
}
