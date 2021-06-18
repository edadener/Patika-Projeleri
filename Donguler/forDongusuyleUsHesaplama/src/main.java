import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // kullanıcının girdiği değerler ile üslü sayı hesaplayan program
        Scanner input = new Scanner(System.in);
        int n, k;
        System.out.print("Ussu alinacak sayi : ");
        n = input.nextInt();
        System.out.print("Us olacak sayi : ");
        k = input.nextInt();

        int total = 1;
        for (int i=1 ; i<=k ; i++){
            total *= n;
        }
        System.out.println("Sonuc : "+total);
    }
}
