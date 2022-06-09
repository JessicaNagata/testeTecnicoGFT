package exercicio3;

public class Mensagem {
    private String texto;
    private String reacoes;

    public Mensagem(String texto, String reacoes) {
        this.texto = texto;
        this.reacoes = reacoes;
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getReacoes() {
        return reacoes;
    }

    public void setReacoes(String reacoes) {
        this.reacoes = reacoes;
    }
    
}
