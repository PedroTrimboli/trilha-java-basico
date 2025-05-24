package SmartTv;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartTv smartTv = new SmartTv();

        System.out.println("PADRAO:");
        System.out.println("TV ligada? " + smartTv.onOff);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume + "\n\n");

        smartTv.estadoTv(sc);
        if(smartTv.onOff) {
            smartTv.estadoCanal(sc);
            smartTv.estadoVolume(sc);
        }
    
        System.out.println("Atualização:");
        System.out.println("TV ligada? " + smartTv.onOff);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume + "\n\n");

        sc.close();
    }
}
