import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Vücud Kitle İndeksi Hesaplama");
        Scanner a = new Scanner(System.in);

        double boy, kilo;
        System.out.print("Boyunuzu giriniz (metre) : ");
        boy = a.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = a.nextDouble();
        double indeks;
        indeks = kilo /(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+indeks);
    }
}
