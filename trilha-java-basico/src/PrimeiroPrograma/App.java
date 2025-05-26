package PrimeiroPrograma;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quer exibir meu App? (1- Sim | 2- Não)");
        int exibir = sc.nextInt();
        sc.nextLine();

        if(exibir == 1) {

            JFrame janela = new JFrame("Meu primeiro App");
            janela.setSize(300, 150);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel mensagem = new JLabel("Hello, World!", JLabel.CENTER);
            janela.add(mensagem);

            janela.setVisible(true);
        }

        sc.close();
    }
}