import java.util.Scanner;

public class main {
    //geçme notu 55
    //not 0 ile 100 arasında değilse ortalamaya katılmasın
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, turk, fzk, kmy, biyo;

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
      if (mat<0 || mat>100)
          mat = 0;

        System.out.print("Türkçe notunuz : ");
        turk = input.nextInt();
        if (turk<0 || turk>100)
            turk = 0;

        System.out.print("Fizik notunuz : ");
        fzk = input.nextInt();
        if (fzk<0 || fzk>100)
            fzk = 0;

        System.out.print("Kimya notunuz : ");
        kmy = input.nextInt();
        if (kmy<0 || kmy>100)
            kmy = 0;

        System.out.print("Biyoloji notunuz : ");
        biyo = input.nextInt();
        if (biyo<0 || biyo>100)
            biyo = 0;



        double avarage = (mat+ turk + fzk + kmy + biyo)/5;
        System.out.println("Ortalamanız : "+ avarage);
        if (avarage>55)
            System.out.println("Tebrikler sınıfı geçtiniz..");
        else
            System.out.println("Sınıfta kaldınız.");


    }
}
