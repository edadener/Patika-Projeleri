import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lenght;
        System.out.print("Basamak sayisi : ");
        lenght = input.nextInt();

        for (int i = 0; i < lenght; i++) {
            System.out.print(" ");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = lenght; j > i; j--) {
                System.out.print("*");
            }

            for (int j = lenght - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}