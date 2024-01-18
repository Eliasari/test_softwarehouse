package perpustakaan;

public class Laporan {
    public void Laporan(Buku buku){
        int a = buku.getjmlBuku(); //memanggil fungsi untuk mendapatkan size atau length dari variabel array list namaBuku
        
        System.out.println("-----DAFTAR BUKU-----");
        System.out.println(" ");
        System.out.println("ID BUKU \t Nama Buku \t Stok \t Harga Peminjaman");
        for(int i = 0; i < a; i++){
            System.out.println(i + ".\t" + buku.getnamaBuku(i) + "\t" + buku.getstok(i) + "\tRp " + buku.getnharga(i) + "/minggu");
        } 
    }
    public void Laporan(Siswa siswa){
        int a = siswa.getjmlSiswa(); //Memanggil fungsi untuk mendapatkan size/length dari variabel arraylist namaBuku
        
        System.out.println("");
        System.out.println("~~~~~~ Daftar Siswa Yang Terdata ~~~~~~");
        System.out.println("");
        System.out.println("ID \tNama Siswa \tAlamat \tTelepon \tstatus");
        for(int i = 0; i < a; i++){
            System.out.println(i + ".\t" + siswa.getNama(i) + "\t" + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatus(i) );
        }
    }
    public void Laporan(Petugas petugas){
        int a = petugas.getjmlPetugas(); //Memanggil fungsi untuk mendapatkan size/length dari variabel arraylist namaBuku
        
        System.out.println("");
        System.out.println("~~~~~~ Daftar Siswa Yang Terdata ~~~~~~");
        System.out.println("");
        System.out.println("ID \tNama Siswa \tAlamat \tTelepon");
        for(int i = 0; i < a; i++){
            System.out.println(i + ".\t" + petugas.getNama(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) );
        }
    }
}

