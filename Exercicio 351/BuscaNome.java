/*Criar um algoritmo que armazene cinco nomes em um vetor e depois possa 
ser digitado um número que corresponde a uma pessoa e imprimir esse nome. */

import javax.swing.JOptionPane;
public class BuscaNome{

public static void main(String []args){
String s ;
String[] nome = new String[5];
int i,numero;

for ( i = 0; i < 5 ; i++){

s = JOptionPane.showInputDialog("Entre com o nome:");
nome[i] =  s;

}

s = JOptionPane.showInputDialog("Entre com o Numero da Pessoa:");
numero =  Integer.parseInt(s);

if (numero >5){
JOptionPane.showMessageDialog(null,"Numero fora de alcance");
}
else{
JOptionPane.showMessageDialog(null,"O nome correspondente ao numero da pessoa é: "+nome[numero-1]);
}

}
}