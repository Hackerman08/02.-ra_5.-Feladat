
package feladat_5;

import java.util.Scanner;



public class Feladat_5 {

  
    public static void main(String[] args) {
        
        
        int a;
        int b;
        char c;
        int terület;
        int kerület;
        int negyzetterulet;
        int negyzetkerulet;
       Scanner input = new Scanner(System.in);
        
        
        System.out.println("Kérem adja meg az A oldat: ");
       
        a= input.nextInt();
        System.out.println("Kérem adja meg a B oldalt: ");
       
        b= input.nextInt();
          
         System.out.println("Kérem adjon meg egy karaktert(T/K): ");
        c = input.next().charAt(0);
            terület=a*b;
            kerület=(a+b)*2;
            negyzetterulet= a*a;
            negyzetkerulet=4*a;
        if(a==b && 'T'==c || 't'==c ){
            System.out.println("Ez egy négyzet "); 
            System.out.println("A négyzet területe: "+negyzetterulet);
        }else if(a==b && 'K'==c || 'k'==c){
             System.out.println("Ez egy négyzet "); 
             System.out.println("A négyzet kerülete: "+negyzetkerulet);
        }else if('T'==c || 't'==c ){
            System.out.println("A téglalap területe: "+terület);
        } else if('K'==c || 'k'==c){
             System.out.println("A téglalap kerületét: "+kerület);
        }else{
            System.out.println("Hiba!!!");
        }
                
      
        
       
    }
    
}
