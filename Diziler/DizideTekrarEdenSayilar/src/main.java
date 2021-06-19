import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter=0;
        int[]dizi={3, 5, 7, 11, 9, 9, 11, 11, 7, 3, 7};

        System.out.print("Aratmak istediginiz sayi : ");
        int search=input.nextInt();

        for(int i=0; i < dizi.length; i++){
            if( search == dizi[i] ){
                counter=counter+1;
            }
        }
        System.out.println("Tekrar edilme sayisi : " + counter);
    }

}



