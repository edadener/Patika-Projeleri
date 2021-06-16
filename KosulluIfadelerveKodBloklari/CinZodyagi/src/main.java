import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bornYear ;
        System.out.print("Dogdugunuz yili giriniz : ");
        bornYear = input.nextInt();
         if (bornYear % 12 == 0) {
             System.out.println("Çin Zodyağı Burcunuz : Maymun");
         }
         else if (bornYear % 12 == 1){
             System.out.println("Çin Zodyağı Burcunuz : Horoz");
         }
         else if (bornYear % 12 == 2){
             System.out.println("Çin Zodyağı Burcunuz : Köpek");
         }
         else if (bornYear % 12 == 3){
             System.out.println("Çin Zodyağı Burcunuz : Domuz");
         }
         else if (bornYear % 12 == 4){
             System.out.println("Çin Zodyağı Burcunuz : Fare");
         }
         else if (bornYear % 12 == 5){
             System.out.println("Çin Zodyağı Burcunuz : Öküz");
         }
         else if (bornYear % 12 == 6){
             System.out.println("Çin Zodyağı Burcunuz : Fare");
         }
         else if (bornYear % 12 == 7){
             System.out.println("Çin Zodyağı Burcunuz : Tavşan");
         }
         else if (bornYear % 12 == 8){
             System.out.println("Çin Zodyağı Burcunuz : Ejderha");
         }
         else if (bornYear % 12 == 9){
             System.out.println("Çin Zodyağı Burcunuz : Yılan");
         }
         else if (bornYear % 12 == 10){
             System.out.println("Çin Zodyağı Burcunuz : At");
         }
         else if (bornYear % 12 == 11){
             System.out.println("Çin Zodyağı Burcunuz : Koyun");
         }


    }
}
