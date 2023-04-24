package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class InverterFila {
    public static void main(String[] args) {

        List<Integer> f1 = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            f1.add(i);
        }

        List<Integer> f2 = inverterFila(f1);

        System.out.println("Fila F2 invertida: ");
        for (int i = 0; i < f2.size(); i++) {
            System.out.print(f2.get(i) + " ");
        }
        System.out.println();
    }

    public static List<Integer> inverterFila(List<Integer> f1) {
        List<Integer> f2 = new ArrayList<>(); 

        for (int i = f1.size() - 1; i >= 0; i--) {
            f2.add(f1.get(i));
        }

        return f2;
    }
}
