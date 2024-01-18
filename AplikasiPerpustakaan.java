/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.Scanner;

public class AplikasiPerpustakaan {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        do{
           Buku buku = new Buku();
           Laporan laporan = new Laporan();
           Siswa siswa = new Siswa();
           Peminjaman peminjaman = new Peminjaman();
           Petugas petugas = new Petugas();
           
           laporan.Laporan(petugas);
           laporan.Laporan(buku);
           laporan.Laporan(siswa);
           
           peminjaman.prosesPeminjaman(siswa, peminjaman, buku, laporan);
           
           laporan.Laporan(buku);
           laporan.Laporan(siswa);
           
           System.out.println("Lanjutkan atau matikan 1 : 99");
           System.out.print("===> ");
           input = scan.nextInt();
           }while (input != 99);   
                
    }
}
