import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField numero1textField;
    private JTextField numero2textField;
    private JButton OKButton;
    private JLabel numero1;
    private JLabel numero2;
    private JLabel ResultadoLbl;
    public JPanel menuPrincipal;

    public form1() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola a todos");
                String n1=numero1textField.getText();
                String n2= numero2textField.getText();
                int num1,num2,resultado;
                num1=Integer.parseInt(numero1textField.getText());
                num2=Integer.parseInt(numero2textField.getText());
                resultado=num1+num2;
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(resultado);
                String r3=Integer.toString(resultado);
                ResultadoLbl.setText("Resultado: "+r3);
            }
        });
    }
}

