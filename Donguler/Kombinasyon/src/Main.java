import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kombinasyon hesaplama : C(n,r) = n! / (r! * (n-r)!)
        Scanner input = new Scanner(System.in);
        int n,r;
        int nFak=1;
        int rFak=1;
        int nrFak=1 ;

        System.out.print("Birinci sayi :");
        n = input.nextInt();
        System.out.print("Ikinci sayi :");
        r = input.nextInt();
                  if (n<r) {
                      System.out.println("n sayisi r'den buyuk olmali..");
                     }
                  else {
                      for (int i = 1; i <= n; i++) {
                          nFak = nFak * i;
                      }
                      System.out.println("n faktoriyel : " + nFak);

                      for (int j = 1; j <= r; j++) {
                          rFak = rFak * j;
                      }
                      System.out.println("r faktoriyel : " + rFak);

                      for (int k = 1; k <= (n - r); k++) {
                          nrFak = nrFak * k;
                      }
                      System.out.println("(n-r) faktoriyel : " + nrFak);

                      int a = rFak * nrFak;
                      int com = nFak / a;
                      System.out.println("(n, r) kombinasyonu : " + com);
                  }
    }
}
