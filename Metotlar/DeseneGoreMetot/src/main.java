import java.util.Scanner;
public class main {
    public static void metot(int number, int tmp, boolean status) {

        if (number <= tmp) {
            System.out.println(number);
            if (number > 0 && !status) {
                metot(number-5,tmp,false);
            }else{
                metot(number+5,tmp,true);
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = inp.nextInt();
        int tmp = n;
        metot(n,tmp,false);

    }

}