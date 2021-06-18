package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplama
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Sayiyi giriniz : ");
        a = input.nextInt();
        int total=0, counter=0 ;
        for (int i=1; i <= a ; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
               total += i ;
               counter++;
            }
        }
        double average = total / counter;
        System.out.println("Ortalama : " + average);

    }
}
