import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //kucukten buyuge siralama
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Birinci sayi : ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayi : ");
        n2 = input.nextInt();
        System.out.print("Ucuncu sayi : ");
        n3 = input.nextInt();

        if ((n1 < n2) && (n1 < n3)) {
            if ( n2 < n3 ){
                System.out.println("n1 < n2 < n3");
            }else {
                System.out.println("n1 < n3 < n2");
        }
        }else if ((n2 < n1) && (n2 < n3 )){
            if (n1 < n3) {
                System.out.println("n2 < n1 < n3 ");
            }else {
                System.out.println("n2 < n3 < n1");
            }
        }else {
            if (n2 < n1) {
                System.out.println("n3 < n2 < n1");
            }else {
                System.out.println("n3 < n1 < n2");
            }

        }




    }
}
