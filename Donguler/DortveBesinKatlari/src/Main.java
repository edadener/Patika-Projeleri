import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sayi giriniz : ");
        n = input.nextInt();

        System.out.println("4'un kuvvetleri :");
        for (int i = 1 ; i <= n ; i *= 4) {
            System.out.println(i);
        }
        System.out.println("5'in kuvvetleri :");
        for (int i = 1 ; i <= n ; i *= 5) {
            System.out.println(i);
        }


    }
}
