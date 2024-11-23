import javax.swing.JOptionPane;

public class Matriz2 {

    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] DIF = new int[5][5];


     
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                A[L][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de A[" + (L + 1) + "][" + (c + 1) + "]:"));
                B[L][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o element de B[" + (L + 1) + "][" + (c + 1) + "]:"));
                DIF[L][c] = A[L][c] - B[L][c];  
        }
        }

        System.out.println("\nMATRIZ DIFERENCA:");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(DIF[L][c] + "\t");
            }
            System.out.println();
}
}
}
