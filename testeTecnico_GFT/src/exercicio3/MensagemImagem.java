package exercicio3;

public class MensagemImagem extends Mensagem{
     String linkImagem;

    public MensagemImagem(String linkImagem, String usuario, String texto, String reacoes) {
        super(usuario, texto, reacoes);
        this.linkImagem = linkImagem;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nLink Vídeo: " + linkImagem;
    }

     
}
