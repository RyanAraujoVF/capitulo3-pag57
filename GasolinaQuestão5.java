
package gasolina.questão5;

import javax.swing.JOptionPane;


public class GasolinaQuestão5 {

    
    public static void main(String[] args) {
     
        String preco = JOptionPane.showInputDialog("Digite o preço do litro da gasolina:");
        double precoLitro = Double.parseDouble(preco);       
        String pagamento = JOptionPane.showInputDialog("Digite o valor do pagamento:");
        double valorPagamento = Double.parseDouble(pagamento);
        
        double litros = valorPagamento / precoLitro;
        
        JOptionPane.showMessageDialog(null, "Você colocou " + litros + " litros de gasolina no tanque.");
    }
}