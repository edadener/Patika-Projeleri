import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double pi=3.14;
        Scanner inp = new Scanner(System.in);
        int r, a;

        System.out.print("Yarıçapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        a=inp.nextInt();

        double alan =(pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı : "+alan);


    }
}
