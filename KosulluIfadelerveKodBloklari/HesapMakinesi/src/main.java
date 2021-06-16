import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2;
        System.out.print("Birinci sayiyi giriniz : ");
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayiyi giriniz : ");
        sayi2 = input.nextDouble();

        System.out.println("İSLEM SECİNİZ");
        System.out.println("1.TOPLAMA");
        System.out.println("2.CİKARMA");
        System.out.println("3.CARPMA");
        System.out.println("4.BOLME");

        System.out.print("Seçiminizi giriniz : ");
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama isleminin sonucu : " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Cikarma isleminin sonucu : " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu : " + (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bolme isleminin sonucu : " + (sayi1/sayi2));
                break;


        }


    }
}
