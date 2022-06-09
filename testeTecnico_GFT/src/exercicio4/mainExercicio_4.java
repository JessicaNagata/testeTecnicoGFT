package exercicio4;

import javax.swing.JOptionPane;

public class mainExercicio_4 {

    public static void main(String[] args) {
        String opt = "";

        float nota1;
        float nota2;
        float nota3;
        float peso1;
        float peso2;
        float peso3;

        while (!opt.equals("3")) {
            opt = JOptionPane.showInputDialog("Menu\n\n1 - Média aritmetica\n"
                    + "2 - Média Ponderada\n"
                    + "3 - Sair");

            if (opt == null) {
                System.exit(0);
            }
            switch (opt) {
                case "1":
                    nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
                    nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));

                    JOptionPane.showMessageDialog(null, "Média Aritmética: " + (nota1 + nota2) / 2);

                    break;

                case "2":
                    nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
                    peso1 = Float.parseFloat(JOptionPane.showInputDialog("Peso nota 1: "));
                    nota1 = nota1 * peso1;

                    nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
                    peso2 = Float.parseFloat(JOptionPane.showInputDialog("Peso nota 2: "));
                    nota2 = nota2 * peso2;

                    nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3: "));
                    peso3 = Float.parseFloat(JOptionPane.showInputDialog("Peso nota 3: "));
                    nota3 = nota3 * peso3;

                    JOptionPane.showMessageDialog(null, "Média Ponderada: " + (nota1 + nota2 + nota3) / (peso1 + peso2 + peso3));

                    break;

                case "3":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente", "Atenção", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
