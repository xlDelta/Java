import javax.swing.JOptionPane;

public class Matriz {

    public static void main(String[] args) {
        int[][] n = new int[5][5];
        int soma = 0;

       
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                String s = JOptionPane.showInputDialog("Digite o elemento da posição [" + L + "][" + c + "]:");
                n[L][c] = Integer.parseInt(s);
        }
        }

        System.out.println("Toda a matriz:");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(n[L][c] + "\t");
            }
            System.out.println();
        }
        for (int L = 1; L < 5; L++) {
            for (int c = 5 - L; c < 5; c++) {
                if (n[L][c] % 2 == 1) {  
                    soma += n[L][c] * n[L][c];  
        }
        }
        }
        System.out.println("\nRaiz quadrada da soma dos quadrados dos números ímpares: " + Math.sqrt(soma));
        }
        }
