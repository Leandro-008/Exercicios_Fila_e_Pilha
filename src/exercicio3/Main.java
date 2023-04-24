package exercicio3;

public class Main {
    public static void main(String[] args) {

        FilaDecolagem filaDecolagem = new FilaDecolagem();

        Aviao aviao1 = new Aviao("Aviao1", 101);
        filaDecolagem.adicionarAviao(aviao1);

        Aviao aviao2 = new Aviao("Aviao2", 202);
        filaDecolagem.adicionarAviao(aviao2);

        filaDecolagem.listarNumeroDeAvioesNaFila();

        filaDecolagem.listarAvioesNaFila();

        filaDecolagem.listarCaracteristicasPrimeiroAviao();

        filaDecolagem.autorizarDecolagem();

        filaDecolagem.listarNumeroDeAvioesNaFila();

        filaDecolagem.listarAvioesNaFila();
    }
}

