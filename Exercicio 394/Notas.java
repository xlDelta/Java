/*Criar um algoritmo que possa armazenar nome, duas notas e média de 50 alunos.
A média será calculada segundo o critério: peso 3 para a primeira nota e peso 7
para a segunda. A impressão deverá conter nome, duas notas e a média. */
import javax.swing.JOptionPane;

public class Notas {
    public static void main(String[] args) {
        
        String[] nomes = new String[50];
        double[] nota1 = new double[50];
        double[] nota2 = new double[50];
        double[] medias = new double[50];
        int opcao = 0;

        for (int i = 0; i < 50; i++) {
            nomes[i] = "";
            nota1[i] = 0;
            nota2[i] = 0;
            medias[i] = 0;
        }
        
        while (opcao != 6) {
           
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "ESCOLA VIVA\n 1 - Entrar nomes\n 2 - Entrar 1ª nota\n 3 - Entrar 2ª nota\n 4 - Calcular média\n 5 - Listar no display\n 6 - Sair\n Escolha uma opção:"
            ));

            switch (opcao) {
                case 1: // 
                    for (int i = 0; i < 50; i++) {
                        nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");
                    }
                    break;

                case 2: // 
                    for (int i = 0; i < 50; i++) {
                        nota1[i] = Double.parseDouble(JOptionPane.showInputDialog(
                            "Digite a 1 nota do aluno " + nomes[i] + ":"));
                    }
                    break;

                case 3: 
                    for (int i = 0; i < 50; i++) {
                        nota2[i] = Double.parseDouble(JOptionPane.showInputDialog(
                            "Digite a 2 nota do aluno " + nomes[i] + ":"));
                    }
                    break;

                case 4:
                    for (int i = 0; i < 50; i++) {
                        medias[i] = (nota1[i] * 3 + nota2[i] * 7) / 10.0;
                    }
                    JOptionPane.showMessageDialog(null, "Media calculada");
                    break;

                case 5: 
                    for (int i = 0; i < 50; i++) {
                        JOptionPane.showMessageDialog(null,
                            "Aluno: " + nomes[i] + "\n" +
                            "1 Nota: " + nota1[i] + "\n" +
                            "2 Nota: " + nota2[i] + "\n" +
                            "Média: " + String.format("%.2f", medias[i]) + "\n");
                    }
                    break;

                case 6: 
                    JOptionPane.showMessageDialog(null, "Finalizado");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida");
}
}
}
}
