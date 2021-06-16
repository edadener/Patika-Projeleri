import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        {
            /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
              Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
              Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
              Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */
            int heat;
            Scanner input = new Scanner(System.in);
            System.out.print("Sıcakliği giriniz : ");
            heat = input.nextInt();

            if (heat<5) {
                System.out.println("Kayak yapmaya gidebilirsiniz.");
            }else if ( heat>=5 && heat<10 ){
                System.out.println("Sinemaya gidebilirsiniz.");
            }else if(heat>=10 && heat<15 ) {
                System.out.println("Ister sinemaya ister piknige gidebilirsiniz.");
            }else if (heat>=15 && heat<25 ) {
                System.out.println("Piknige gidebilirsiniz.");
            }
            else if (heat>=25 ) {
                System.out.println("Yuzmeye gidebilirsiniz.");
            }else {
                System.out.println("Tanimli sicaklik degeri bulunamadi..");
            }
        }
    }
}
