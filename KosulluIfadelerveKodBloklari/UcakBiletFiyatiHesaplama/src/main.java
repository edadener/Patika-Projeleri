import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dist, age, travelType;

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        dist = input.nextInt();
        System.out.print("Yasiniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz(1.Tek yon / 2.Gidis-donus) : ");
        travelType = input.nextInt();
        double total = dist * 0.10;
        double totalPrice;

        if ((dist > 0 ) && (age > 0 ) && (travelType == 1 || travelType == 2 )) {
            double ageSale;
            if (age < 12) {
                 ageSale = total * 0.5;
            }else if ( age >= 12 && age <24) {
                 ageSale =  total * 0.10;
            }else if ( age > 65 ) {
              ageSale =  total * 0.30;
            }else {
                ageSale = 0;
            }
            double newTotal = total - ageSale;

           if (travelType == 2) {
                 double travelTypeSale = newTotal * 0.20;
                 double travelTypeTotal = (newTotal - travelTypeSale)*2;
                 System.out.println("toplam : "+travelTypeTotal);
             }else {
                 System.out.println("toplam : "+newTotal);
             }




        }else {
            System.out.println("Hatalı veri girdiniz!!");
        }


    }
}
