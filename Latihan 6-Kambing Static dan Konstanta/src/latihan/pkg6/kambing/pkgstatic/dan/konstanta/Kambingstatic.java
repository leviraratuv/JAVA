/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg6.kambing.pkgstatic.dan.konstanta;

/**
 *
 * @author Windows_10
 * Nama     : Levira Ratu Vitaloka
 * Kelas    : TI-IB
 * NIM      : A2.1900096
 * Deskripsi Program : Program ini menampilkan program tentang kambing static
 */
public class Kambingstatic {
    //variabel jumlahkambing dideklarasikan sebagai statik
    
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak" + Mamalia.
                jumlahKambing);
    }
    
}
