package exercicio3;

public class MensagemVideo extends Mensagem{
    String linkVideo;

    public MensagemVideo(String linkVideo, String texto, String reacoes) {
        super(texto, reacoes);
        this.linkVideo = linkVideo;
    }
    
}
