import java.util.Scanner;

public class main {
    public static void main(String[] args) {
     //   Bir sayının basamak sayılarının toplamını hesaplayan program
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sayiyi giriniz : ");
        n = input.nextInt();

        int total = 0 , counter = 0;
        while (n != 0) {
            total=(n%10)+total;
            n /= 10;
            ++counter;
        }

        System.out.println("Basamaklarin toplami : "+ total);
    }
}
