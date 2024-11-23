import javax.swing.JOptionPane;

public class HotelFazenda {
    public static void main(String[] args) {
        String opcao;
        int continuar = 0;

   
        int[] leitos = new int[50];
        double[] precos = new double[50];
        String[] situacoes = new String[50]; 
        String[] datasEntrada = new String[50];
        String[] datasSaida = new String[50];
        int[] numeroDiarias = new int[50];
        double[] despesas = new double[50];

    
        for (int i = 0; i < 50; i++) {
            leitos[i] = 2; 
            precos[i] = 100.0; 
            situacoes[i] = "livre";
            datasEntrada[i] = "";
            datasSaida[i] = "";
            numeroDiarias[i] = 0;
            despesas[i] = 0.0;
        }

        while (continuar == 0) {
            opcao = JOptionPane.showInputDialog(
                    "Entre com uma opção:\n 1 - Ver dados de um quarto\n  2 - Alterar situação de um quarto\n   3 - Registrar aluguel \n 4 - Registrar despesas\n +5 - Sair"
            );

            switch (opcao) {
                case "1":
                    int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto (1-50):")) - 1;
                    if (quarto >= 0 && quarto < 50) {
                        String info = "Quarto " + (quarto + 1) + ":\n" +
                                      "Leitos: " + leitos[quarto] + "\n" +
                                      "Preço: R$" + precos[quarto] + "\n" +
                                      "Situação: " + situacoes[quarto] + "\n" +
                                      "Data de entrada: " + datasEntrada[quarto] + "\n" +
                                      "Data de saída: " + datasSaida[quarto] + "\n" +
                                      "Número de diárias: " + numeroDiarias[quarto] + "\n" +
                                      "Despesas: R$" + despesas[quarto];
                        JOptionPane.showMessageDialog(null, info);
                    } else {
                        JOptionPane.showMessageDialog(null, "Número de quarto inválido.");
                    }
                    break;

                case "2": 
                    quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto :")) - 1;
                    if (quarto >= 0 && quarto < 50) {
                        String novaSituacao = JOptionPane.showInputDialog("Digite a nova situação (livre, alugado, reservado):");
                        situacoes[quarto] = novaSituacao;
                        JOptionPane.showMessageDialog(null, "Situação atualizada com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Número de quarto inválido.");
                    }
                    break;

                case "3": 
                    quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do quarto (1-50):")) - 1;
                    if (quarto >= 0 && quarto < 50 && situacoes[quarto].equals("livre")) {
                        datasEntrada[quarto] = JOptionPane.showInputDialog("Digite a data de entrada (dd/mm/aaaa):");
                        datasSaida[quarto] = JOptionPane.showInputDialog("Digite a data de saida (dd/mm/aaaa):");
                        numeroDiarias[quarto] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de diarias:"));
                        situacoes[quarto] = "alugado";
                        JOptionPane.showMessageDialog(null, "Aluguel registrado com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Quarto não está disponível para aluguel.");
                    }
                    break;

                case "4": 
                    quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto (1-50):")) - 1;
                    if (quarto >= 0 && quarto < 50 && situacoes[quarto].equals("alugado")) {
                        double despesa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da despesa:"));
                        despesas[quarto] += despesa;
                        JOptionPane.showMessageDialog(null, "Despesa registrada ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Quarto nao está alugado ");
                    }
                    break;

                case "5": 
                    JOptionPane.showMessageDialog(null, "Fim do algoritmo.");
                    continuar++;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida.");
                    break;
}
}
}
}
