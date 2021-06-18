
import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("0 ile 100 arasinda bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatali girisiniz hakkınızdan düsecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler!! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatali bir sayi girdiniz!");
                if (selected > number) {
                    System.out.println(selected + " sayisi, gizli sayıdan buyuktur.");
                } else {
                    System.out.println(selected + " sayisi, gizli sayıdan kucuktur.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkiniz : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}