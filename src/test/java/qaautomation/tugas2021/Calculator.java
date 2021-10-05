package qaautomation.tugas2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilihan [1/2/3/4] = ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:{
                penjumlahan();
                break;
            }
            case 2:{
                pengurangan();
                break;
            }
             case 3:{
                perkalian();
                break;
            }
             case 4:{
                 pembagian();
                 break;
            }
        }
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
        }
	}
	
	private static void pembagian() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		   System.out.print("masukkan nilai (a):");
		   double a = scan.nextInt();
		   System.out.print("masukkan nilai (b):");
		   double b = scan.nextInt();
		   
		   double hasil=a/b;
		   System.out.println("hasil jumlah "+a+" / "+b+" = "+hasil);
	}

	private static void perkalian() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		   System.out.print("masukkan nilai (a):");
		   int a = scan.nextInt();
		   System.out.print("masukkan nilai (b):");
		   int b = scan.nextInt();
		   
		   int hasil=a*b;
		   System.out.println("hasil jumlah "+a+" x "+b+" = "+hasil);
	}

	private static void pengurangan() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		   System.out.print("masukkan nilai (a):");
		   int a = scan.nextInt();
		   System.out.print("masukkan nilai (b):");
		   int b = scan.nextInt();
		   
		   int hasil=a-b;
		   System.out.println("hasil jumlah "+a+" - "+b+" = "+hasil);
	}

	private static void penjumlahan() {
		// TODO Auto-generated method stub
		
			Scanner scan = new Scanner (System.in);
			   System.out.print("masukkan nilai (a):");
			   int a = scan.nextInt();
			   System.out.print("masukkan nilai (b):");
			   int b = scan.nextInt();
			   
			   int hasil=a+b;
			   System.out.println("hasil jumlah "+a+" + "+b+" = "+hasil);
		
	}

	
}
