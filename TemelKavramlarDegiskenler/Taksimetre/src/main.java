
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner msf = new Scanner(System.in);
        int km;
        double perKm=2.20, toplam=10;
        System.out.print("Gidilen mesafe(km) :");
        km = msf.nextInt();

        toplam += (km * perKm);
        if (toplam<20)
            toplam=20;

        System.out.println("Toplam Tutar : "+toplam);


    }
}
