import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month;

        System.out.print("Dogdugunuz gun : ");
        day = input.nextInt();
        System.out.print("Kacinci ayda dogdunuz : ");
        month = input.nextInt();


        // Koç Burcu : 21 Mart - 20 Nisan
        if ((month==3 && day>=21)||(month==4 && day<=20)) {
            System.out.println("Koç");
        }
        // Boğa Burcu : 21 Nisan - 21 Mayıs
        else if ((month==4 && day>=21)||(month==5 && day<=21)) {
            System.out.println("Boğa");
        }
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        else if ((month==5 && day>=22)||(month==6 && day<=22)) {
            System.out.println("Ikizler");
        }
        // Yengeç Burcu : 23 Haziran - 22 Temmuz
        else if ((month==6 && day>=23)||(month==7 && day<=22)) {
            System.out.println("Yengec");
        }
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        else if ((month==7 && day>=23)||(month==8 && day<=22)) {
            System.out.println("Aslan");
        }
        //Başak Burcu : 23 Ağustos - 22 Eylül
        else if ((month==8 && day>=23)||(month==9 && day<=22)) {
            System.out.println("Başak");
        }
        //Terazi Burcu : 23 Eylül - 22 Ekim
        else if ((month==9 && day>=23)||(month==10 && day<=22)) {
            System.out.println("Terazi");
        }
        //Akrep Burcu : 23 Ekim - 21 Kasım
        else if ((month==10 && day>=23)||(month==11 && day<=21)) {
            System.out.println("Akrep");
        }
        //Yay Burcu : 22 Kasım - 21 Aralık
        else if ((month==11 && day>=22)||(month==12 && day<=21)) {
            System.out.println("Yay");
        }
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        else if ((month==12 && day>=22)||(month==1 && day<=21)) {
            System.out.println("Oglak");
        }
        //Kova Burcu : 22 Ocak - 19 Şubat
        else if ((month==1 && day>=22)||(month==2 && day<=19)) {
            System.out.println("Kova");
        }
        //Balık Burcu : 20 Şubat - 20 Mart
        else if ((month==2 && day>=20)||(month==3 && day<=21)) {
            System.out.println("Balık");
        }
    }
}
