import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //6 --> 1, 2, 3
        //28 --> 1, 2, 4, 7, 14
        int n;
        int total = 0;
        System.out.print("Sayiyi giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n ; i++) {
            if ( n % i == 0) {
                total += i;
            }
        }
        if (total == n) {
            System.out.println("Mukemmel sayidir..");
        }else {
            System.out.println("Mukemmel sayi degildir..");
        }

    }
}
