package SmartTv;

import java.util.Scanner;

public class SmartTv {
    boolean onOff = false;
    int canal = 1;
    int volume = 25;

    public void estadoTv(Scanner sc) {
        System.out.println("Voce quer ligar a TV? (1- sim || 2- Não)");
        int estadoTv = sc.nextInt();

        if(estadoTv == 1) {
            onOff = true;
            System.out.println("TV esta ligada\n\n");
        } else {
            System.out.println("TV ainda esta desligada\n\n");
        }
    }

    public void estadoCanal(Scanner sc) {
        System.out.println("Qual canal você quer colocar?");
        canal = sc.nextInt();

        System.out.println("O canal atual da TV é: " + canal + "\n\n");
    }

    public void estadoVolume(Scanner sc) {
        System.out.println("Qual volume você quer colocar?");
        volume = sc.nextInt();

        if(volume > 100) {
            volume = 100;
            System.out.println("O volume não pode ser maior que 100, o volume foi definido para 100");
        }

        System.out.println("O volume atual da TV é: " + volume + "\n\n");
    }
}
