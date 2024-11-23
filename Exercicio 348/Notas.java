/*Criar um algoritmo que armazene nome e duas notas de 5 alunos e imprima uma
listagem contendo nome, as duas notas e a média de cada aluno */
import javax.swing.JOptionPane;
public class Notas{

public static void main(String []args){
String s ;
String[] nome = new String[5];
double[] n1 = new double[5];
double[] n2 = new double[5];
double[] Media= new double[5];
int i;

for ( i = 0; i < 4 ; i++){


s = JOptionPane.showInputDialog("Entre com o nome:");
nome[i] =  s;

s = JOptionPane.showInputDialog("Entre com a nota 1");
n1[i] = Double.parseDouble (s);

s = JOptionPane.showInputDialog("Entre com a nota 2");
n2[i] = Double.parseDouble (s);

Media[i] = (n1[i] +n2[i])/2;

}
for ( i = 0; i < 4 ; i++){

System.out.println("Nome:"+nome[i] +"  Nota 1: "+n1[i]+"  Nota 2: "+n2[i]+"  Media: "+Media[i]);

}
}
}