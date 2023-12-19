import javax.swing.JOptionPane;

// Criando a classe Padaria
public class PadariaQuestão3 {

  // Definindo os preços dos produtos
  public static final double PRECO_PAES = 0.12;
  public static final double PRECO_BROAS = 1.50;

  // Definindo a porcentagem da poupança
  public static final double PORCENTAGEM_POUPANCA = 0.10;

  // Método principal
  public static void main(String[] args) {

    // Lendo as quantidades de pães e broas vendidas
    String inputPaes = JOptionPane.showInputDialog("Digite a quantidade de pães vendidos:");
    String inputBroas = JOptionPane.showInputDialog("Digite a quantidade de broas vendidas:");

    // Convertendo as entradas em números inteiros
    int qtdPaes = Integer.parseInt(inputPaes);
    int qtdBroas = Integer.parseInt(inputBroas);

    // Calculando o total arrecadado com a venda dos pães e broas
    double totalVendas = (qtdPaes * PRECO_PAES) + (qtdBroas * PRECO_BROAS);

    // Calculando o valor a ser guardado na poupança
    double valorPoupanca = totalVendas * PORCENTAGEM_POUPANCA;

    // Exibindo os resultados na tela
    JOptionPane.showMessageDialog(null, "O total arrecadado com a venda dos pães e broas foi de R$" + String.format("%.2f", totalVendas));
    JOptionPane.showMessageDialog(null, "O valor a ser guardado na poupança é de R$" + String.format("%.2f", valorPoupanca));

  }
}