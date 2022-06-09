package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class mainExercicio_3 {
    
    //Jesus....não deu tempo rs

    public static void main(String[] args) {
      String usuario;
      String texto;
      String reacoes;
      String linkImagem;
      String linkVideo;
      
      Mensagem msg;
      
      ArrayList<Mensagem> listaMensagens = new ArrayList();
      
      usuario = JOptionPane.showInputDialog("Usuário: ");
      texto = JOptionPane.showInputDialog("Mensagem: ");
      reacoes = JOptionPane.showInputDialog("Reação: ");
      msg = new Mensagem(usuario, texto, reacoes);
      listaMensagens.add(msg);
      
      
      usuario = JOptionPane.showInputDialog("Usuário: ");
      texto = JOptionPane.showInputDialog("Mensagem: ");
      reacoes = JOptionPane.showInputDialog("Reação: ");
      linkVideo = JOptionPane.showInputDialog("Link vídeo: ");
      msg = new MensagemVideo(linkVideo, usuario, texto, reacoes);
      listaMensagens.add(msg);
      
      usuario = JOptionPane.showInputDialog("Usuário: ");
      texto = JOptionPane.showInputDialog("Mensagem: ");
      reacoes = JOptionPane.showInputDialog("Reação: ");
      linkImagem = JOptionPane.showInputDialog("Link imagem: ");
      msg = new MensagemImagem(linkImagem, usuario, texto, reacoes);
      listaMensagens.add(msg);
       
       for(Mensagem item: listaMensagens){
       JOptionPane.showMessageDialog(null, item.toString());
       }
       
    }
    
}
