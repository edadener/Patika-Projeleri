import java.util.Scanner;

public class main {
    public static void main(String[] args) {
         //  tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        //  girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı

        Scanner input = new Scanner(System.in);
        int a;
        int total=0;

        do {
            System.out.print("Sayi giriniz : ");
            a = input.nextInt();

            if (( a % 2 == 0 ) && ( a % 4 == 0)) {
                total += a;
            }
        }while( a % 2 == 0 );

        System.out.println("Toplam : " + total);

    }
}
