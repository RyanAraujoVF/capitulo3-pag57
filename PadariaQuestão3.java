import javax.swing.JOptionPane;

public class PadariaQuestão3 {

  public static final double PRECO_PAES = 0.12;
  public static final double PRECO_BROAS = 1.50;
  public static final double PORCENTAGEM_POUPANCA = 0.10;

  public static void main(String[] args) {

    String inputPaes = JOptionPane.showInputDialog("Digite a quantidade de pães vendidos:");
    String inputBroas = JOptionPane.showInputDialog("Digite a quantidade de broas vendidas:");

    int qtdPaes = Integer.parseInt(inputPaes);
    int qtdBroas = Integer.parseInt(inputBroas);
    
    double totalVendas = (qtdPaes * PRECO_PAES) + (qtdBroas * PRECO_BROAS);
    double valorPoupanca = totalVendas * PORCENTAGEM_POUPANCA;

    JOptionPane.showMessageDialog(null, "O total arrecadado com a venda dos pães e broas foi de R$" + String.format("%.2f", totalVendas));
    JOptionPane.showMessageDialog(null, "O valor a ser guardado na poupança é de R$" + String.format("%.2f", valorPoupanca));

  }
}
