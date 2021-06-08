import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner not = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = not.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = not.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = not.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = not.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = not.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = not.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam/6.0;

        System.out.println("Ortalamanız : " +sonuc);




    }
}
