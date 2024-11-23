/*
Criar um algoritmo que leia o preço de compra e o preço de venda de 100 mercadorias 
O algoritmo devera imprimir quantas mercadorias proporcionam
*/
import javax.swing.JOptionPane;
public class Signo{

public static void main(String []args){
String s;


int data, i, dia, mes;
String[] signo = new String[12];
int[] Ultimodia = new int[12];



for ( i = 0; i < 12 ; i++){

s = JOptionPane.showInputDialog("Digite o Signo:");
signo[i] = s;

s = JOptionPane.showInputDialog("Digite o Ultimo dia do Mes:");
Ultimodia[i] = Integer.parseInt(s);
}

s = JOptionPane.showInputDialog("Digite o ddmm ou digite 9999 para finalizar o programa:");
data = Integer.parseInt (s);
while(data != 9999){
dia = data / 100;
mes = data %100;
mes--;

if(dia>Ultimodia[mes]){
    mes = (mes + 1)%12;
}
    JOptionPane.showMessageDialog(null,signo[mes]+"\n");
s = JOptionPane.showInputDialog("Digite o ddmm ou digite 9999 para finalizar o programa:");
data = Integer.parseInt (s);

}
}
}



