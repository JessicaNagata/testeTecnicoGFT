package exercicio3;

public class MensagemVideo extends Mensagem{
    String linkVideo;

    public MensagemVideo(String linkVideo, String usuario, String texto, String reacoes) {
        super(usuario, texto, reacoes);
        this.linkVideo = linkVideo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nLink Vídeo: " + linkVideo;
    }
}
