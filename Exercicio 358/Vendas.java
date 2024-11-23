/*
Criar um algoritmo que leia o preço de compra e o preço de venda de 100 mercadorias 
O algoritmo devera imprimir quantas mercadorias proporcionam
*/
import javax.swing.JOptionPane;
public class Vendas{

public static void main(String []args){
String s ;

double[] precoCompra = new double[5];
double[] precoVenda = new double[5];
double lucro;
int lucroMenor10 = 0;
int lucroMenor20 = 0;
int lucroMaior20 = 0;
int i;

for ( i = 0; i < 100 ; i++){



s = JOptionPane.showInputDialog("Preco de Compra:");
precoCompra[i] = Double.parseDouble (s);

s = JOptionPane.showInputDialog("Preco de Venda:");
precoVenda[i] = Double.parseDouble (s);



}
for ( i = 0; i < 100 ; i++){
lucro = precoVenda[i] - precoCompra[i] / precoCompra[i] * 100 ;


if (lucro < 10) { 
    lucroMenor10++; 
} 
else if (lucro <= 20) {
    lucroMenor20++; 
} 
else{ lucroMaior20++;
}
}
System.out.println("Mercadorias com lucro Menor que 10%: " + lucroMenor10); 
System.out.println("Mercadorias Lucro menor que 20%: " + lucroMenor20); 
System.out.println("Mercadorias com lucro Maior que 20%: " + lucroMaior20);
}
}


