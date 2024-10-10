package Calc;
import javax.swing.JOptionPane;
import Calc.calculadora;

public class Interface {

    calculadora cc = new calculadora();
    int resultado ;

    public void start(){

        String opc = JOptionPane.showInputDialog(null,"CALCULADORA  ADICAO 1 SUBT 2");
        resultado = cc.operando(Integer.parseInt(opc));

        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado );

        String res = JOptionPane.showInputDialog(null,"DESEJA FAZR OUTRA OPERAÇÃO Y/N");

        if(res.equalsIgnoreCase("Y") ){
            start();
        }else{
            JOptionPane.showMessageDialog(null, "OBRIGADO!");
        }

    }
}
