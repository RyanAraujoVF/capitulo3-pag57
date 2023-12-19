
package mediaponderada.questão8;

import javax.swing.JOptionPane;

public class MediaPonderadaQuestão8 {
   
    public static void main(String[] args) {
    String nota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
    String nota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
    String nota3 = JOptionPane.showInputDialog("Digite a terceira nota:");

    double nota1Double = Double.parseDouble(nota1);
    double nota2Double = Double.parseDouble(nota2);
    double nota3Double = Double.parseDouble(nota3);

    double media = (nota1Double * 1 + nota2Double * 2 + nota3Double * 3) / 6;

    JOptionPane.showMessageDialog(null, "A média ponderada é " + media);
  }
}