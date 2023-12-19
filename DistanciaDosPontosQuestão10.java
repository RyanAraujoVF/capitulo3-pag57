
package distanciadospontos.questão10;

import javax.swing.JOptionPane;


public class DistanciaDosPontosQuestão10 {

    
    public static void main(String[] args) {
    
    String x1 = JOptionPane.showInputDialog("Digite a coordenada x do primeiro ponto:");
    String y1 = JOptionPane.showInputDialog("Digite a coordenada y do primeiro ponto:");
    
    String x2 = JOptionPane.showInputDialog("Digite a coordenada x do segundo ponto:");
    String y2 = JOptionPane.showInputDialog("Digite a coordenada y do segundo ponto:");

    double x1Double = Double.parseDouble(x1);
    double y1Double = Double.parseDouble(y1);
    double x2Double = Double.parseDouble(x2);
    double y2Double = Double.parseDouble(y2);

    double distancia = Math.sqrt(Math.pow(x2Double - x1Double, 2) + Math.pow(y2Double - y1Double, 2));

    JOptionPane.showMessageDialog(null, "A distância entre os pontos é " + distancia);
  }
}