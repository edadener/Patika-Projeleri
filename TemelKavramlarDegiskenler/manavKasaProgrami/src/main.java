import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /* Armut : 2,14 TL
           Elma : 3,67 TL
           Domates : 1,11 TL
           Muz: 0,95 TL
           Patlıcan : 5,00 TL */
        Scanner a = new Scanner(System.in);
        double armt, elma, domts, muz, ptlcn;
        System.out.print("Kaç kilo armut : ");
        armt = a.nextDouble();
        System.out.print("Kaç kilo elma : ");
        elma = a.nextDouble();
        System.out.print("Kaç kilo domates : ");
        domts = a.nextDouble();
        System.out.print("Kaç kilo muz : ");
        muz = a.nextDouble();
        System.out.print("Kaç kilo patlıcan : ");
        ptlcn = a.nextDouble();

        double total;
        total = armt*2.14 + elma*3.67 + domts*1.11 + muz*0.95 + ptlcn*5.0 ;

        System.out.println("Toplam Tutar : " + total);

    }
}
