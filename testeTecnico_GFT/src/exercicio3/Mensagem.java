package exercicio3;

public class Mensagem {
    private String usuario;
    private String texto;
    private String reacoes;

    public Mensagem(String usuario, String texto, String reacoes) {
        this.usuario = usuario;
        this.texto = texto;
        this.reacoes = reacoes;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    @Override
    public String toString() {
        return "Mensagem{" + "usuario=" + usuario + ", \n" + texto + ", \n" + reacoes + '}';
    }

}
