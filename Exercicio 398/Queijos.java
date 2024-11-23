/*A Fabrica de Queijo Rio Novense deseja elaborar um algoritmo para controlar o
estoque e as vendas. Inicialmente, deverão ser lidos e armazenados em vetores: o
código, a quantidade disponível em estoque e o preço de venda dos produtos. O
término do cadastramento é determinado quando se digita -1 para o código do
produto. Sabe-se que a Fábrica de Queijo Rio Novense trabalha com no máximo
50 produtos diferentes.
A segunda fase do algoritmo é a venda. Deverá ser lido o código do produto a ser
vendido e a quantidade requerida. Se o código do produto estiver cadastrado, a
venda poderá ser realizada; caso contrário, a mensagem Produto Não-Cadastrado deverá ser exibida no monitor. 
Caso o produto esteja disponível, a venda só
poderá ser realizada se a quantidade disponível no estoque for suficiente para
atender ao pedido. Nesse caso, você deverá abater do estoque a quantidade vendida. 
Se o estoque não for suficiente para atender ao pedido, a mensagem Estoque Insuficiente deverá ser exibida no monitor. 
O final das vendas será detectado
quando o código do produto for igual a zero.
No final devera aparecer uma listagem no video contendo o total vendido no dia
e a relação de todos os produtos do estoque, com suas respectivas quantidades,
em ordem decrescente de quantidades disponíveis
*/
import javax.swing.JOptionPane;

public class Queijos {
    public static void main(String[] args) {
        
        int k = 0, codi, codigo, i, quantidade, op;
        int[] cod = new int[50];
        int[] quant = new int[50];
        double[] preco = new double[50];
        double geral = 0, venda;

  
        while (k < 50) {
            codi = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto ou 0 para finalizar:"));
            if (codi == 0) {
                break;
            }
            
            cod[k] = codi;
            quant[k] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));
            preco[k] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto:"));
            k++;
        }

       
        while (true) {
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n 1 - Vender produto\n 2 - Exibir produtos\n 3 - Finalizar venda\n 4 - Exibir estoque\n 5 - Relatório de vendas\n 6 - Sair"));

            switch (op) {
                case 1:
                  
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto para venda ou 0 para finalizar:"));
                    if (codigo == 0) {
                        break;
                    }

                    i = 0;
                    while (i < k && cod[i] != codigo) {
                        i++;
                    }

                    if (i == k) {
                        JOptionPane.showMessageDialog(null, "Produto nao cadastrado");
                    } else {
                        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade para venda:"));
                        if (quantidade > quant[i]) {
                            JOptionPane.showMessageDialog(null, "Estoque insuficiente");
                        } else {
                            quant[i] -= quantidade;
                            venda = quantidade * preco[i];
                            geral += venda;
                            JOptionPane.showMessageDialog(null, "Venda realizada. Valor: " + venda);
                        }
                    }
                    break;

                case 2:
                   
                    String produtos = "Produtos cadastrados:\n";
                    for (i = 0; i < k; i++) {
                        produtos += "Coodigo: " + cod[i] + " | Quantidade: " + quant[i] + " | Preço: " + preco[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, produtos);
                    break;

                case 3:
                  
                    JOptionPane.showMessageDialog(null, "Total vendido: " + geral);
                    break;

                case 4:
                    
                    String estoque = "Estoque atual:\n";
                    for (i = 0; i < k; i++) {
                        estoque += "Codigo: " + cod[i] + " | Quantidade: " + quant[i] + " | Preco: " + preco[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, estoque);
                    break;

                case 5:
                    
                    JOptionPane.showMessageDialog(null, "Total de vendas: " + geral);
                    break;

                case 6:
                  
                    JOptionPane.showMessageDialog(null, "Fim do programa");
                    return;

                default:
                
                    JOptionPane.showMessageDialog(null, "Opcao nao disponivel");
                    break;
}
}
}
}




