/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 */
public class PBO210117063Latihan22PerhitunganLingkaran {

    /*
    Nama : Cessario Sheva Lakita Purwa Adidjaya
    Kelas: If-2
    Nim  : 10117063
    Deskripsi Program : Menampilkan Jari2 LIngkaran, Luas Lingkaran, 
    dan Keliling LIngkaran
    */
    public static void main(String[] args) {
        double dmtr,jr,ls,kel;
        String d;
        
        
        System.out.println("====Perhitungan Lingkaran====");
        Scanner scanner = new Scanner(System.in);
        
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scanner.nextLine();
            //validasi input yang masuk
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        
        System.out.println("===Hasil Perhitungan Lingkaran===");
        //Proses Konversi String ke Double
        dmtr = Double.parseDouble(d); 
        
       //Proses Hitung lingkaran
        jr = dmtr/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",jr);
        ls = Math.PI*jr*jr;
        System.out.printf("Luas Lingkaran = %.2f cm %n",ls);
        kel = 2*Math.PI*jr;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",kel);
    }
    
}
    
    

