package Calc;
import Calc.operacao;

import javax.swing.*;

public class calculadora {

    operacao  op = new operacao();

    int escolha;

    String num1;
    String num2;

    int result;

    calculadora(){
    }

    public int operando(int escolha){

        num1 = JOptionPane.showInputDialog("DIGITE O PRIMEIRO NÚMERO: ");
        num2 = JOptionPane.showInputDialog("DIGITE O SEGUNDO NÚMERO: ");

        if(escolha == 1){result = op.Soma(Integer.parseInt(num1), Integer.parseInt(num2));

        }else if(escolha == 2){result =  op.sub(Integer.parseInt(num1), Integer.parseInt(num2));}

        return result;

    }


}
