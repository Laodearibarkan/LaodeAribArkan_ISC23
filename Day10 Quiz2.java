package day_10_quiz2.java;

import java.util.Scanner;

public class Day_10_Quiz2Java {

    public static void main(String[] args) {
        Scanner Aco = new Scanner(System.in);
        
        System.out.print("Masukkan nilai m : " );
        int m = Aco.nextInt();
        
        System.out.print("Masukkan nilai n : " );
        int n = Aco.nextInt();
        
        if (m < n){
         for (int a = m + 1; a < n; a++){
             System.out.print(a);
             
           if(a < n - 1){
               System.out.print(",");  
           }  
         }   
        } 
        System.out.println();
    }
    
}