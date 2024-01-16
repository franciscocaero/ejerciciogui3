import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JButton OKButton;
    public JTextField N1textField1;
    public JTextField N2textField2;
    private JLabel numero1;
    private JLabel numero2;
    public JPanel menuCalculadora;
    private JLabel result;

    public Calculadora() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    int num1=Integer.parseInt(N1textField1.getText());
                    int num2=Integer.parseInt(N2textField2.getText());
                    String r1,r2,r3,r4;
                    System.out.println(r1=Integer.toString(num1+num2));

                    System.out.println(r2=Integer.toString(num1-num2));
                    System.out.println(r3=Integer.toString(num1*num2));
                    System.out.println(r4=Integer.toString(num1/num2));

                    result.setText("Resultados:    \nSuma:   "+r1+"  Resta:   "+r2+"  Multiplicacion:  "+r3+"  División:  "+r4);
                }
                catch (Exception ex){
                    result.setText("Ingrese solo valores numéricos");
                }
            }
        });
    }
}
