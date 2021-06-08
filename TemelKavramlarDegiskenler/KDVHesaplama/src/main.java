import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // girilen tutar 0 ve 1000 tl arasında ise kdv %18
        // 1000TL'den büyük ise %8

        Scanner ttr = new Scanner(System.in);
        double tutar, kdvOran, kdvTutarı, kdvliTutar;
        System.out.print("Tutarı giriniz : ");
        tutar = ttr.nextDouble();




        if (tutar>=0 && tutar<=1000) {
            kdvOran=0.18;
            kdvTutarı = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutarı;
            System.out.println("KDV'siz tutar : "+ tutar);
            System.out.println("KDV Oranı : "+ kdvOran);
            System.out.println("KDV Tutarı : "+ kdvTutarı);
            System.out.println("KDV'li Tutar : "+kdvliTutar);
        }
        else if (tutar>1000) {
            kdvOran=0.8; kdvTutarı = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutarı;
            System.out.println("KDV'siz tutar : "+ tutar);
            System.out.println("KDV Oranı : "+ kdvOran);
            System.out.println("KDV Tutarı : "+ kdvTutarı);
            System.out.println("KDV'li Tutar : "+kdvliTutar);
        }
        else {
            System.out.println("Hatalı tutar girdiniz.");
        }


    }
}