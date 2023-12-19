
package ferradurasdocavalo.questão2;

import javax.swing.JOptionPane;


public class FerradurasDoCavaloQuestão2 {

    public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Quantos cavalos você comprou para um haras?");
     int numCavalos = Integer.parseInt(input);
     int numFerraduras = numCavalos * 4;
     JOptionPane.showMessageDialog(null, "Você precisará de " + numFerraduras + " ferraduras para equipar todos os seus cavalos.");
    }
}