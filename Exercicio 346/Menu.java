/*Criar um algoritmo que funcione através do menu a seguir:
MENU
1 - Imprime o comprimento da frase
2 - Imprime os dois primeiros e os dois últimos caracteres da frase
3-Imprime a frase espelhada
4- Termina o algoritmo
OPCAO */

import javax.swing.JOptionPane;
public class Menu{

public static void main(String []args){
String s,Frase;
int e=0;

while (e == 0) {

s = JOptionPane.showInputDialog("Entre com uma opcao: \n 1 - Imprime o comprimento da frase   2 - Imprime os dois primeiros e \n os dois últimos caracteres da frase    3-Imprime a frase espelhada  \n 4- Termina o algoritmo ");

 switch(s){
            case "1": 
            s = JOptionPane.showInputDialog("Entre com a Frase");
            Frase = s;  
            JOptionPane.showMessageDialog(null, Frase.length()); 
break;
            case "2": 
            s = JOptionPane.showInputDialog("Entre com a Frase");
            Frase = s; 
            JOptionPane.showMessageDialog(null,"Primeiros 2 Caracteres: "+ Frase.substring(0,2) + "  Ultimos 2 Caracteres;" +Frase.substring(Frase.length()-2)); 
break;
            case "3":
            s = JOptionPane.showInputDialog("Entre com a Frase");
            Frase = s;
            String Espelho = new StringBuilder(Frase).reverse().toString();
             JOptionPane.showMessageDialog(null,"Frase Espelhada: "+Espelho);
        
break;
            case "4":    JOptionPane.showMessageDialog(null, "Fim do algoritmo");
                            e++;
            default: JOptionPane.showMessageDialog(null, "Numero Fora de Intervalo");

break;
 }
}
}
}
