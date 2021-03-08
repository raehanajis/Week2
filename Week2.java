/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class Week2 {

    public static void main(String[] args) {
        
        
        int angka ;
        Scanner input =  new Scanner(System.in);
        DecimalFormat For = new DecimalFormat("00");
        
        //Buat angka random 
        Random acak = new Random();
        
        // mendapatkan digit dari user
        int a1, a2;
            
        // mendapatakan digit dari lottery
        
            int acak_b1 = acak.nextInt(9 - 0);
            int acak_b2 = acak.nextInt(9 - 0);
            
        //Testing    
        System.out.println("The lottery number is " + acak_b1 + "" + acak_b2);
        
        //Buat Input angka
        System.out.println("Enter Number Lottery (Two Digits) = ");
        angka = input.nextInt();
        
         // Check kebenaran
        //Kondisi di saat user lebih input
         if (angka > 99) {
            System.out.println("Lebih Dari dua digit");

        } else {
            String inputFor = For.format(angka);

            a1 = Character.getNumericValue(inputFor.charAt(0));
            a2 = Character.getNumericValue(inputFor.charAt(1));
            
            //Jika Nomor Sama Semua
            if (a1 == acak_b1 && a2 == acak_b2) {
            System.out.println("Selamat anda mendapatkan $10.000");
            
            //Jika Nomor Sama , Tetapi posisi berbeda 
            } else if (a1 == acak_b2 && a2 == acak_b1) 
            {
                System.out.println("Selamat anda mendapatkan $3.000");
            } 
            //Jika satu nomor Sama
            else if (a1 == acak_b1 || a2 == acak_b2 || a1 == acak_b2 || a2 == acak_b1) 
            {
                System.out.println("Selamat anda mendapatkan $1000");    
            }
            //Jika Tidak Ada nomor yang sama 
            else 
            {
                System.out.println("Belum Beuntung");
            }
        }
        
       
    }
}
