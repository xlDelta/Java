/*
Criar um algoritmo que realize as reservas de passagem aéreas de uma companhia.
 Além da leitura do número de vôos e da quantidade de lugares disponíveis,
leia vários pedidos de reserva, constituídos do número da carteira de identidade
do cliente e do número do vôo desejado.
Para cada cliente, verificar se há possibilidade no vôo desejado. Em caso afirmativo,
imprimir o número da identidade do cliente e o número do vôo, 
atualizando o número de lugares disponíveis. Caso contrário, avisar ao cliente a inexistência de lugares. 
*/
import javax.swing.JOptionPane;

public class Aeroporto {

    public static void main(String[] args) {
        String s;

    
        s = JOptionPane.showInputDialog("Entre com o número de voos:");
        int NumeroVoos = Integer.parseInt(s);

        int[] Voos = new int[NumeroVoos];
        int[] Lugares = new int[NumeroVoos];

        for (int i = 0; i < NumeroVoos; i++) {
            s = JOptionPane.showInputDialog("Entre com o número do voo " + (i + 1) + ":");
            Voos[i] = Integer.parseInt(s);

            s = JOptionPane.showInputDialog("Entre com o número de lugares disponíveis no voo " + Voos[i] + ":");
            Lugares[i] = Integer.parseInt(s);
        }

        
        s = JOptionPane.showInputDialog("Entre com o número da identidade do cliente:");
        String identidade = s;

    
        s = JOptionPane.showInputDialog("Entre com o número do voo desejado:");
        int vooDesejado = Integer.parseInt(s);

      
        int encontrado = -1; 
        for (int i = 0; i < NumeroVoos; i++) {
            if (Voos[i] == vooDesejado) {
                encontrado = i;
                break;
            }
        }

        if (encontrado != -1) { 
            if (Lugares[encontrado] > 0) {
                
                Lugares[encontrado]--;
                System.out.println("Reserva confirmada: Cliente " + identidade + " no voo " + vooDesejado);
            } else {
                
                System.out.println("Voo " + vooDesejado + " está lotado. Reserva não realizada.");
        }
        } else {
            System.out.println("Voo " + vooDesejado + " não encontrado.");
        }

        System.out.println("\nReservas finalizadas.");
    }
}
