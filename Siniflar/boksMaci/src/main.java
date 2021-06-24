import java.util.Scanner;

public class main { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    fighter marc = new fighter("Pierre" , 17 , 101, 91, 0);
    fighter alex = new fighter("Hooijdonk" , 11 , 97, 97, 0);

    //eklendi
    int hesapla = (int) (Math.random()*2); // 0 marc || 1 alex
    if(hesapla==0){
        System.out.println("Pierre Basliyor");
        ring r = new ring(alex,marc , 90 , 100);
        r.run();
    }
    if (hesapla==1) {
        System.out.println("Hooijdonk Basliyor");
        ring r = new ring(marc,alex , 90 , 100);
        r.run();
    }

}
}