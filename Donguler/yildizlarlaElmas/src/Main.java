import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  lenght;
        System.out.print("Uzunlugu giriniz : ");
        lenght = input.nextInt();

        for (int satir = 0; satir < lenght; satir++) {
            System.out.print(" ");

            for (int sutun = lenght; sutun > satir; sutun--) {
                System.out.print(" ");
            }

            for (int sutun = 0; sutun <= satir; sutun++) {
                System.out.print("*");
            }

            for (int sutun = 0; sutun < satir; sutun++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int satir = 0; satir < lenght; satir++) {
            System.out.print("  ");

            for (int sutun = 0; sutun < satir; sutun++) {
                System.out.print(" ");
            }

            for (int sutun = lenght; sutun > satir; sutun--) {
                System.out.print("*");
            }

            for (int sutun = lenght-1; sutun > satir; sutun--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}