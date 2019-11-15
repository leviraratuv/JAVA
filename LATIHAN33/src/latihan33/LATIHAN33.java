/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33;
import java.util.Scanner;

/**
 *
 * @author Windows_10
 * Nama     : Levira Ratu Vitaloka
 * Kelas    : TI-IB
 * NIM      : A2.1900096
 * Deskripsi Program : Program ini menampilkan program tentang memasukkan nilai 
 * dari keyboard
 */
public class LATIHAN33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama anda: ");
        Scanner Scanner = new Scanner(System.in);
        
        String nama = Scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
    }
    
}
