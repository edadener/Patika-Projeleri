import java.util.Scanner;

public class main {
    static boolean asalMi(int n, int i)
    {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return asalMi(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi : ");
        int n = inp.nextInt();
        if(asalMi(n, 2))
            System.out.println("Asal sayidir");
        else
            System.out.println("Asal sayi degildir");
    }
}