package konzol;

import java.util.Scanner;

public class Konzol {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int kor;
        String nev;
        /* egyszeri bekérés: */
//        System.out.print("korod: ");
//        kor = sc.nextInt();
//        
//        System.out.print("neved: ");
//        nev = sc.nextLine();
//        
//        System.out.print("neved: " + nev);
//        System.out.println(", korod: " + kor);
        
        /* bekérés ellenőrzéssel: */
        kor = 0;
        nev = "";
        boolean jo = false;
        while(!jo){
            System.out.print("korod: ");
            kor = sc.nextInt();

            sc.nextLine();
            System.out.print("neved: ");
            nev = sc.nextLine();
            jo = kor>6 && nev.length()>=3;
        }
        System.out.print("neved: " + nev);
        System.out.println(", korod: " + kor);
        
        int dobas = (int)(Math.random()*6+1);
        System.out.println("1 dobás eredménye: " + dobas);        
        int osszeg = (int)(Math.random()*(12-2+1)+2);
        System.out.println("2 dobás összege: " + osszeg);        
        
        /* Java specifikus konzolos bekérés: */
//        do {
//
//        } while (!jo);
    }
    
}
