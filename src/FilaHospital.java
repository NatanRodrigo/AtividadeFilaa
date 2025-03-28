import java.util.LinkedList;
import java.util.Queue;

public class FilaHospital {
    private Queue<String> fila;
    private LinkedList<String> historico;
    private int contadorSenha;

    public FilaHospital() {
        fila = new LinkedList<>();
        historico = new LinkedList<>();
        contadorSenha = 1;
    }

    public void gerarSenha() {
        String senha = "P" + contadorSenha++;
        fila.add(senha);
        System.out.println("Senha gerada: " + senha);
    }

    public String chamarProximo() {
        if (!fila.isEmpty()) {
            String chamado = fila.poll();
            historico.add(chamado);
            return "Chamando senha: " + chamado;
        } else {
            return "Nenhuma senha na fila.";
        }
    }

    public void historicoChamadas() {
        System.out.println("Histórico de chamadas: " + historico);
    }
}
