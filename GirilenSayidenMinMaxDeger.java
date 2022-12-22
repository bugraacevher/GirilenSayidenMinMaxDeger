package Giris;

import java.util.Scanner;

public class GirilenSayidenMinMaxDeger {
    public static void main(String[] args) {
        //klavyeden girilen ne tane sayma sayisinindan en buyuk ve en kucuk sayilari bulan ve busaqyilari ekrana yazan program
        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz : ");
        int n = input.nextInt();
        int min = 0, max = 0;
        for (int i = 1 ; i <= n ; i++){
            System.out.print(i + ". sayiyi giriniz : ");
            int a = input.nextInt();


            if (a >= max){
                max = a;
            }else if(a<=min){
                min = a;
            }
        }
        System.out.println("min deger : " + min);
        System.out.println("max deger : " + max);
    }
}
