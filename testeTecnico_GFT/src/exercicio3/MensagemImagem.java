package exercicio3;

public class MensagemImagem extends Mensagem{
     String linkImagem;

    public MensagemImagem(String linkImagem, String texto, String reacoes) {
        super(texto, reacoes);
        this.linkImagem = linkImagem;
    }
     
}
