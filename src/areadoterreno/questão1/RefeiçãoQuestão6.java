
package refeição.questão6;

import javax.swing.JOptionPane;

public class RefeiçãoQuestão6 {
 
    public static void main(String[] args) {
    double preco = 12.00;
    String peso = JOptionPane.showInputDialog("Digite o peso do seu prato (em quilos):");
    double pesoDouble = Double.parseDouble(peso);

    double valor = pesoDouble * preco;

    JOptionPane.showMessageDialog(null, "O valor da sua refeição é R$" + valor);
  }
}