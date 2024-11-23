/*Armazenar 15 números inteiros em um vetor NUM e imprimir uma listagem numerada 
contendo o número e uma das mensagens: par ou ímpar. */
import javax.swing.JOptionPane;
public class Notas{

public static void main(String []args){
String s ;
int[] Num = new int[16];

int i;

for ( i = 0; i < 15 ; ){


s = JOptionPane.showInputDialog("Entre com o " + ++i +" numero :");
Num[i] = Integer.parseInt(s);
}

for ( i = 0; i < 15 ; i++){



    
    if ( Num[i]%2 == 0 ){
          System.out.println("["+ i +"]"+"Numero:"+Num[i]+ " eh PAR\n" );
            
    }else{
        System.out.println("["+ i +"]"+"Numero:"+Num[i]+ " eh iMPAR\n" );

    }
}


}
}
