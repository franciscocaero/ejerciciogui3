import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        JFrame  frame=new JFrame("Suma de dos números");
//        frame.setContentPane(new form1().menuPrincipal);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(640,480);
//        frame.pack();
//        frame.setVisible(true);
        Scanner miVariable=new Scanner(System.in);
        JFrame fram2=new JFrame("Calculadora");
        fram2.setContentPane(new Calculadora().menuCalculadora);
        fram2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram2.setSize(640,480);
        fram2.pack();
        fram2.setVisible(true);

    }
}
