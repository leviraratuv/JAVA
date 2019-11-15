/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5.kambing.global;

/**
 *
 * @author Windows_10
 * Nama     : Levira Ratu Vitaloka
 * Kelas    : TI-IB
 * NIM      : A2.1900096
 * Deskripsi Program : Program ini menampilkan tentang kambing global
 */
public class Latihan5KambingGlobal {

        // Variabel jumlahkambing menjadi variabel instance
        
        int jumlahKambing = 88;
        
        // Method untuk menampilkan jumlah kambing
        public void getJumlahKambing() {
            System.out.println("Jumlah kambing: " + jumlahKambing);
        }
        public void tambahKambing() {
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah kambing setelah ditambah: " + 
                    jumlahKambing);
        }
    public static void main(String[] args) {
       Latihan5KambingGlobal kambingSusu = new Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    }
    

