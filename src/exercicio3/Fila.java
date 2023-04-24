package exercicio3;
import java.util.ArrayList;
import java.util.List;

class FilaDecolagem {

private List<Aviao> fila = new ArrayList<>();

    public void adicionarAviao(Aviao aviao) {
        fila.add(aviao);
        System.out.println("Avião " + aviao.getNome() + " adicionado à fila de espera.");
    }

    public void autorizarDecolagem() {
        if (!fila.isEmpty()) {
            Aviao aviao = fila.get(0);
            System.out.println("Autorizando decolagem do avião " + aviao.getNome() + " (Número: " + aviao.getNumero() + ").");
            fila.remove(0);
        } else {
            System.out.println("Não há aviões na fila de espera.");
        }
    }

    public void listarNumeroDeAvioesNaFila() {
        System.out.println("Número de aviões aguardando na fila de decolagem: " + fila.size());
    }

    public void listarAvioesNaFila() {
        if (!fila.isEmpty()) {
            System.out.println("Aviões na fila de espera:");
            for (Aviao aviao : fila) {
                System.out.println("Nome: " + aviao.getNome() + " | Número: " + aviao.getNumero());
            }
        } else {
            System.out.println("Não há aviões na fila de espera.");
        }
    }

    public void listarCaracteristicasPrimeiroAviao() {
        if (!fila.isEmpty()) {
            Aviao aviao = fila.get(0);
            System.out.println("Características do primeiro avião na fila:");
            System.out.println("Nome: " + aviao.getNome() + " | Número: " + aviao.getNumero());
        } else {
            System.out.println("Não há aviões na fila de espera.");
        }
    }
}
