import java.util.Scanner;

public class main {
    public static void main(String[] args) {
  /*   Kullanıcı girisi
  * Kullanıcı adı yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sor
  * sıfırlamak isterse --> yeni şifresi hatalı girdiği ya da eski şifre olmadığını kontrol et
  * aynı ise --> şifre oluşturulamadı, baska sifre girin
  * farklı ise --> şifre basariyla degistirildi    */

        Scanner input = new Scanner(System.in);
        String userName = "Eda";
        int password = 7091;

        System.out.print("Kullanıcı Adınız :");
        String userNameLog = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        int passwordLog = input.nextInt();

        if(userNameLog.equals(userName) && passwordLog == password)
            System.out.println("Giris Basarili..");
       else {
            System.out.println("Hatalı Giriş!! ");

            System.out.print("Şifre sıfırlamak için '1'e çıkmak için '2'a basınız. ");
            int sayi = input.nextInt();

            switch(sayi){
                case 1:
                    System.out.print("Yeni sifrenizi giriniz : ");
                    int newPass = input.nextInt();

                    if(newPass == password  || newPass == passwordLog ){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }
                    else{
                        System.out.println("Sifreniz basariyla degistirildi.");
                        password = newPass;
                    }
                    break;
                case 2:
                    System.out.println("Programdan cikis yapiliyor..");
                    break;
                default:
                    System.out.println("Hatali tuslama yaptiniz..");
            }
        }
    }

}