package com.umit;

import java.util.Scanner;


public class TurkceString {

    static String ifade= "bu bir string ifadedir";

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("baslangic indexini giriniz.");
        //int baslangic= sc.nextInt();
        // System.out.println("bitis indexini giriniz.");
        //int bitis= sc.nextInt();

        altIfade(0,2);


        indexBul("bir");

        char sonuc2= karakterAl(7);
        System.out.println(sonuc2);


    }//main sonu

    static char karakterAl(int index){
        if (index >=0 && index< ifade.length()){
            return ifade.charAt(index);
        }else System.out.println("Gecersiz index");
        return 0;

    }
    static void indexBul(String karakter){

        System.out.println(ifade.indexOf(karakter));

    }
    static void altIfade(int baslangic, int bitis){

        if (baslangic >= 0 && bitis < ifade.length() && baslangic <= bitis) {
            System.out.println(ifade.substring(baslangic, bitis + 1));
        } else {
            System.out.println("Geçersiz başlangıç veya bitiş index'leri!");
        }

    }


}//class sonu
