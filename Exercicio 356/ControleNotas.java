/*
Armazenar nomes e notas das PR 1 e PR2 de 15 alunos. 
Calcular e armazenar a média arredondada. 
Armazenar também a situação do aluno: AP ou RP. 
Imprimir uma listagem contendo nome notas media e situação de cada aluno tabulando 
*/

import javax.swing.JOptionPane;
public class ControleNotas{

public static void main(String []args){
String s ;
String[] Nome = new String[5];
double[] Pr1 = new double[5];
double[] Pr2 = new double[5];
double[] Media= new double[5];
int i;

for ( i = 0; i < 15 ; i++){


s = JOptionPane.showInputDialog("Entre com o nome:");
Nome[i] =  s;

s = JOptionPane.showInputDialog("Entre com a nota 1");
Pr1[i] = Double.parseDouble (s);

s = JOptionPane.showInputDialog("Entre com a nota 2");
Pr2[i] = Double.parseDouble (s);

Media[i] = (Pr1[i] +Pr2[i])/2;

}
for ( i = 0; i < 15 ; i++){
System.out.println("=============================================");
System.out.println("Nome:"+Nome[i] +"  Nota 1: "+Pr1[i]+"  Nota 2: "+Pr2[i]+"  Media: "+Media[i]);

if(Media[i] < 6){
System.out.println("Situacao do aluno: Aluno Reprovado");
}
else{
System.out.println("Situacao do aluno: Aluno Aprovado");
System.out.println("=============================================");
}
}
}
}