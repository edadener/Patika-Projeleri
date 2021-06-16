import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Yil giriniz : ");
        year = input.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(+ year + " yili artik bir yildir");
        }else{
            System.out.println(+ year + " yili artik bir yil degildir.");
        }

    }
}
