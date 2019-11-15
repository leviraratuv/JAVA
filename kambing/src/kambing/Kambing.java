/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 *
 * @author Windows_10
 * Nama     : Levira Ratu Vitaloka
 * Kelas    : TI-IB
 * NIM      : A2.1900096
 * Deskripsi Program : Program ini menampilkan program tentang kambing
 */
public class Kambing {
    public void tambahKambing () {
    // Deklarasi variabel lokal
    int jumlahkambing = 0;
    
    
    jumlahkambing = jumlahkambing + 5;
    System.out.println("jumlah kambing setelah ditambah: " + jumlahkambing);
    
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
