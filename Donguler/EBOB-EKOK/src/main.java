import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ekok, ebob=1;

        System.out.print("Birinci sayi : ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayi : ");
        n2 = input.nextInt();

        ekok= (n1 > n2) ? n1 : n2;
        while(true)
        {
            if( ekok % n1 == 0 && ekok % n2 == 0 )
            {
                System.out.println("EKOK : " + ekok );
                break;
            }
            ++ekok;
        }

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("EBOB : " + n1);
    }
}

