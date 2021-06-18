import java.util.Scanner;

public class main {

    static double power(double a, double b) {
        Scanner inp = new Scanner(System.in);
        //int result=1;
        System.out.print("Taban degeri : ");
        a = inp.nextInt();
        System.out.print("Us degeri : ");
        b = inp.nextInt();

        if(b == 0) {
            return 1;
        }
        double sonuc = Math.pow(a, b);
        return  sonuc;

    }
     public static void main(String[] args) {
         System.out.println(power(3,5));

     }
}
