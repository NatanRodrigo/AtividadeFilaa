import java.util.Stack;

public class Navegador {
    private Stack<String> historico;
    private Stack<String> avancar;
    private String paginaAtual;

    public Navegador() {
        historico = new Stack<>();
        avancar = new Stack<>();
        paginaAtual = null;
    }

    public void acessarPagina(String url) {
        if (paginaAtual != null) {
            historico.push(paginaAtual);
        }
        paginaAtual = url;
        avancar.clear();
    }

    public void voltar() {
        if (!historico.isEmpty()) {
            avancar.push(paginaAtual);
            paginaAtual = historico.pop();
        }
    }

    public void avancar() {
        if (!avancar.isEmpty()) {
            historico.push(paginaAtual);
            paginaAtual = avancar.pop();
        }
    }

    public String getPaginaAtual() {
        return paginaAtual != null ? paginaAtual : "Nenhuma página aberta";
    }
}
