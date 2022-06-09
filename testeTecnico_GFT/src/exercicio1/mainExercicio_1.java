package exercicio1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class mainExercicio_1 {

    public static void main(String[] args) {
        String palavra1;
        String palavra2;

        palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra: ");
        palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra: ");

        char[] a = palavra1.toCharArray();
        char[] b = palavra2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        if (Arrays.equals(a, b)) {
            JOptionPane.showMessageDialog(null, "As palavras informadas são Anagramas.");
        } else {
            JOptionPane.showMessageDialog(null, "As palavras informadas NÃO são Anagramas.");
        }
    }
}
