import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int max = 0 , min = 0;
        System.out.print("Kaç tane sayi gireceksiniz : ");
        int n = input.nextInt();

        for (int i=1 ; i<=n ; i++) {
            System.out.print("Sayi " + i + " giriniz : ");
            number = input.nextInt();

            if (i==1)
            {
                max=number;
                min=number;
            }

            if (number>max)
                max =number;

            if (number<min)
                min=number;
        }
        System.out.println("En buyuk sayi : "+max);
        System.out.println("En kucuk sayi : "+min);
    }
}
