
package diasdoano.questão7;

import javax.swing.JOptionPane;

public class DiasDoAnoQuestão7 {

    public static void main(String[] args) {
    String dia = JOptionPane.showInputDialog("Digite o dia da data:");
    String mes = JOptionPane.showInputDialog("Digite o mês da data:");

    int diaInt = Integer.parseInt(dia);
    int mesInt = Integer.parseInt(mes);

    if (diaInt < 1 || diaInt > 30 || mesInt < 1 || mesInt > 12) {
      JOptionPane.showMessageDialog(null, "Data inválida!");
    } 
    else 
    {
      int dias = (mesInt - 1) * 30 + diaInt;
      JOptionPane.showMessageDialog(null, "Desde o início do ano, se passaram " + dias + " dias");
    }
  }
}