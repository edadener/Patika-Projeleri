import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int temp;
        System.out.print("Dizinin boyutu : ");
        int a = input.nextInt();

        int[] dizi = new int[a];
        for(int i = 0; i < a; i++)
        {
            System.out.print(+ (i) + ". elemani : ");
            dizi[i] = input.nextInt();
        }
                for(int i = 0; i < a-1; i++)
                {
                    for(int j = i+1; j < a; j++)
                    {
                        if(dizi[j] < dizi[i]) {
                            temp = dizi[i];
                            dizi[i] = dizi[j];
                            dizi[j] = temp;
                        }
                    }
        }
        System.out.println("Kucukten buyuge siralanisi :");
        for(int i = 0; i < a; i++)
        {
            System.out.println( dizi[i] );
        }

    }
}