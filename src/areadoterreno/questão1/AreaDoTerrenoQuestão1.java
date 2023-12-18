
package areadoterreno.questão1;

import javax.swing.JOptionPane;


public class AreaDoTerrenoQuestão1 {

    
    public static void main(String[] args) {
        
    String input1 = JOptionPane.showInputDialog("Insira a largura do terreno em metros:");
        double largura = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Insira o comprimento do terreno em metros:");
        double comprimento = Double.parseDouble(input2);

        double area = largura * comprimento;

        JOptionPane.showMessageDialog(null, "A área do terreno é de " + area + " metros quadrados.");
    }
}