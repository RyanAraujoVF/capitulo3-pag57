
package diasdevida.questão4;

import javax.swing.JOptionPane;

public class DiasDeVidaQuestão4 {

    public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Digite o seu nome:");
    String idade = JOptionPane.showInputDialog("Digite a sua idade:");

    int idadeInt = Integer.parseInt(idade);
    int dias = idadeInt * 365;

    JOptionPane.showMessageDialog(null, nome + ", VOCÊ JÁ VIVEU " + dias + " DIAS");
  }
}