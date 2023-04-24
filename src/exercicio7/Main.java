package exercicio7;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(20);
        for (int i = 1; i <= 20; i++) {
            fila.enfileirar(i);
        }

        System.out.println("Fila original: " + Arrays.toString(fila.getElementos()));

        InverterFilaComPilha.inverterFila(fila);

        System.out.println("Fila invertida: " + Arrays.toString(fila.getElementos()));
    }    
}
