/*Criar um algoritmo que leia dois conjuntos de números inteiros, tendo cada
 um 10 e 20 elementos e apresente os elementos comuns aos conjuntos. Lem-
bre-se de que os elementos podem se repetir mas não podem aparecer repetidos na saída*/
import javax.swing.JOptionPane;
public class Vetores{

public static void main(String []args){
String s ;
int[] vetl= new int[10];
int[] vet2= new int[20];
int[] vetc = new int[10];
int i,c,d,L;
L=0;

for ( i = 0; i < 10 ;i++ ){
s = JOptionPane.showInputDialog("Entre com 10 valores do vetor 1 :");
vetl[i] = Integer.parseInt(s);
}


for ( i = 0; i < 20 ; i++){
s = JOptionPane.showInputDialog("Entre com 20 valores do vetor 20 :");
vet2[i] = Integer.parseInt(s);
}


for(i = 0 ; i <= 9; i++){
vetc[i]= -999999999;
}
for(i = 0 ; i <= 9; i++){
c = 0;

while (vetl[i] != vet2[c] && c < 19)
{c++;}

if (vetl[i]== vet2[c]){
   d = 0;


while(vetl[i] != vetc[d] && d < L){
   d++;
}
if( d ==L){
      vetc[d] = vetl[i]; 
      L++;
}}
}
if(L != 0){
System.out.println("Numeros que se Repetem: "); 

for(i = 0 ; i <= L-1 ; i++){

System.out.println(vetc[i]); 
}
}else{
   System.out.println("Os numeros não se Repetem: "); 
}
System.out.println("\n"); 
}
}

