import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int[] list = {27, 11, 3, 31, 41, 53};

        int min = list[0];
        int min2 = list[1];
        int max = list[0];
        int max2 = list[1];

        for (int i : list) {
            if (i < min) {
                min2 = min;
                min = i;
            }else if(i<min2){
                min2 = list[1];
            }
            if (i > max) {
                max2 = max;
                max = i;
            }else if(i>max2){
                max2 = i;
            }
        }

        System.out.println("Minimum : " + min);
        System.out.println("Minimuma en yakin deger : " + min2);
        System.out.println("Maximum " + max);
        System.out.println("Maximuma en yakin deger : " + max2);
    }

    }

