package exercicio2;

import java.util.Scanner;

public class mainExercicio_2 {

    public static void main(String[] args) {

        float a;
        float b;
        float c;
        double delta; 
        double x1; 
        double x2;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Valor de a: ");
        a = ler.nextFloat();
        
        System.out.println("Valor de b: ");
        b = ler.nextFloat();
        
        System.out.println("Valor de c: ");
        c = ler.nextFloat();

        delta = ((b * b)) - ((4 * a) * c);
        
        System.out.println(delta);

        if (delta >= 0) {
            x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
            
            System.out.println("x': " + x1 + "\nx' ':"  + x2 );
            
        } else {
            System.out.println("Delta não possui raiz ou ela é negativa, o que não permite o cálculo de x' e x' '");
            System.exit(0);
        }

    }
}
