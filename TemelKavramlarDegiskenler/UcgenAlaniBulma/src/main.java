import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Kenarlarını gireceğiniz üçgenin alanını hesaplayan program");
        Scanner knr = new Scanner(System.in);
        double a, b, c;
        System.out.print("Birinci Kenar Uzunluğu : ");
        a = knr.nextDouble();
        System.out.print("İkinci Kenar Uzunluğu : ");
        b = knr.nextDouble();
        System.out.print("Üçüncü Kenar Uzunluğu : ");
        c = knr.nextDouble();

        double u = (a+b+c)/2;
        double alan = Math.sqrt( u*(u-a)*(u-b)*(u-c));


        System.out.println("Üçgenin Alanı : "+alan);

    }
}