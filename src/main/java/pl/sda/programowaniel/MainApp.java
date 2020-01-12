package pl.sda.programowaniel;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //Wzór to °F = (°C × 1.8) + 32
        int cels;
        int d = 32;
        double b = 1.8;
        System.out.println("Celsiusz:");
        cels = new Scanner(System.in).nextInt();
        double cc = cels * b + d;
        System.out.println("Farentgejt:" + cc);

       // 1 км = 1000/1609 сухопутной мили= 0,6215 сухопутной мили
        int mila;
        double dd = 1.609;
        System.out.println("mila:");
        mila = new Scanner(System.in).nextInt();
        double ccc = mila * dd;
        System.out.println("kilometry:" + ccc);

        // Умножьте значение фунтов на 0,454, чтобы получить килограммы
        int funt;
        double ddd = 0.454;
        System.out.println("funt:");
        funt = new Scanner(System.in).nextInt();
        double cccc = funt * ddd;
        System.out.println("kilogramy:" + cccc);
    }
}
