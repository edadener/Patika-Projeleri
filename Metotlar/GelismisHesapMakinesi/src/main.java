import java.util.Scanner;
public class main {
    //sum, minus, times, divided, power, factorial, mod, area
    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0;

        System.out.print("Kaç tane sayi giriceksiniz : ");
        int n = input.nextInt();
        for (int i=1 ; i<=n ; i++) {
            System.out.print("Sayi " + i + " giriniz : ");
            number = input.nextInt();
            result += number;
            if (number == 0) {
                break;
            }
        }
        System.out.println("Sonuc : " +result);
        }

    static void minus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0;
        System.out.print("Kaç tane sayi gireceksiniz : ");
        int n = input.nextInt();
        for (int i=1 ; i<=n ; i++) {
            System.out.print("Sayi " + i + " giriniz : ");
            number = input.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }
    static void times() {
        Scanner input = new Scanner(System.in);
        int number, result = 1;
        System.out.print("Kaç tane sayi gireceksiniz : ");
        int n = input.nextInt();
        for (int i=1 ; i<=n ; i++) {
            System.out.print("Sayi " + i + " giriniz : ");
            number = input.nextInt();
            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;

        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayi gireceksiniz :");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuc : " + result);
    }
    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int n = input.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exp = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= n;
        }

        System.out.println("Sonuç : " + result);

    }
    static void factorial() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuc : " + result);
    }
    static void mod() {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("a sayisi : ");
        a = input.nextInt();
        System.out.println("b sayisi : ");
        b = input.nextInt();
        int result = (a % b);
        System.out.println("a mod b : " + result);

    }

    static void area() {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Kisa kenari giriniz :");
        a = input.nextInt();
        System.out.print("Uzun kenari giriniz :");
        b = input.nextInt();

        int area = a*b;
        int perim = 2*(a+b);
        System.out.println("Alani : " + area);
        System.out.println("Cevresi : " + perim);

    }

 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int select;
     String operations = "1- Toplama İşlemi\n"
                       + "2- Çıkarma İşlemi\n"
                       + "3- Çarpma İşlemi\n"
                       + "4- Bölme işlemi\n"
                       + "5- Üslü Sayı Hesaplama\n"
                       + "6- Faktoriyel Hesaplama\n"
                       + "7- Mod Alma\n"
                       + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                       + "0- Çıkış Yap";
     do {

         System.out.println("*********ISLEMLER*********");
         System.out.println(operations);
         System.out.print("Lütfen bir işlem seciniz :");
         select = input.nextInt();


     switch (select) {
         case 1:
             plus();
             break;
         case 2:
             minus();
             break;
         case 3:
             times();
             break;
         case 4:
             divided();
             break;
         case 5:
             power();
             break;
         case 6:
             factorial();
             break;
         case 7:
             mod();
             break;
         case 8:
             area();
             break;
         default:
             System.out.println("Hatali tuslama yaptiniz!!");
     }
     }while ( select != 0);
 }



}
