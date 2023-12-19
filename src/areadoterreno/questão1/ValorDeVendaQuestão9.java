
package valordevenda.questão9;

import javax.swing.JOptionPane;

public class ValorDeVendaQuestão9 {

    public static void main(String[] args) {

    double precoP = 10.00;
    double precoM = 12.00;
    double precoG = 15.00;
    
    String qtdP = JOptionPane.showInputDialog("Digite a quantidade de camisetas pequenas:");
    String qtdM = JOptionPane.showInputDialog("Digite a quantidade de camisetas médias:");
    String qtdG = JOptionPane.showInputDialog("Digite a quantidade de camisetas grandes:");

    int qtdPInt = Integer.parseInt(qtdP);
    int qtdMInt = Integer.parseInt(qtdM);
    int qtdGInt = Integer.parseInt(qtdG);

    double valor = qtdPInt * precoP + qtdMInt * precoM + qtdGInt * precoG;

    JOptionPane.showMessageDialog(null, "O valor arrecadado com a venda é R$" + valor);
  }
}