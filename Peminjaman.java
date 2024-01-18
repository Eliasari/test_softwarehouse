package perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    //constructor
    public Peminjaman(){
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
        
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(3);
        
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(1);
        
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(2);
    }
    
    public void prosesPeminjaman(Siswa siswa, Peminjaman peminjaman, Buku buku, Laporan laporan){
        Scanner a = new Scanner(System.in);
        System.out.println("-----------PERPUSTAKAAN------------");
        System.out.println("\nMasukkan ID siswa : ");
        int idSiswa = a.nextInt();
        if(siswa.getStatus(idSiswa) == false){
            System.out.println("Selamat Datang " + siswa.getNama(idSiswa) + "\nMohon maaf anda tidak bisa melakukan peminjaman buku");
            System.exit(0);
        }
        System.out.println("Selamat datang " + siswa.getNama(idSiswa) + "\nSilahkan melakukan peminjaman buku!");
        
        //variabel arraylist
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        
        //inputan
        int i = 0;
        int temp = 0;
        do{
            System.out.println("Masukkan kode buku : or end file(99)");
            System.out.println(" ");
            temp = a.nextInt();
            if (temp != 99){
                idBuku.add(temp);
                System.out.println(buku.getnamaBuku(idBuku.get(i)) + "sebanyak : ");
                banyak.add(a.nextInt());
                if(buku.getstok(idBuku.get(i)) < banyak.get(i)){
                    System.out.println("Sisa Buku tida mencukupi!");
                System.exit(0);
            }
            i++;
        }
        }while(temp != 99);
        
        System.out.println("Peminjaman buku dari siswa " + siswa.getNama(idSiswa) + "adalah sebagai berikut : ");
        System.out.println("Nama Buku \tQty \tHarga \tJumlah");
        
        int b = idBuku.size();
        int total = 0;
        for(int k = 0; k < b; k++){
            int jumlah = banyak.get(k) * buku.getnharga(idBuku.get(k));
            total += jumlah;
            System.out.println(buku.getnamaBuku(idBuku.get(k)) + "\t" + banyak.get(k) + "\t" + buku.getnharga(idBuku.get(k)) + "\t" + jumlah);
            peminjaman.setPeminjaman(buku , idSiswa , idBuku.get(k) , banyak.get(k));
        }
        
        System.out.println("Total peminjaman buku = " + total);
        siswa.editstatus(idSiswa,false);
        if(siswa.getStatus(idSiswa) == true){
            System.out.println("Dapat melakukan peminjaman buku!");
        }else{
            System.out.println("Tidak dapat melakukan peminjaman buku");
        }
        
        System.out.print("Apakah ingin mengembalikan buku? ");
        boolean answer = a.nextBoolean();
        if(answer == true){
            siswa.editstatus(idSiswa, true);
            System.out.println("Status = " + siswa.getStatus(idSiswa));
            
            for(int j = 0; j < b; j++){
                peminjaman.setPengembalian(buku , idSiswa , idBuku.get(j) , banyak.get(j));             
            }
            
        }else{
            System.out.println("Anda belum melakukan pengembalian buku!");
            laporan.Laporan(buku);
            laporan.Laporan(siswa);
            System.exit(0);
        }
    }
    public void setPeminjaman(Buku buku , int idSiswa , int idBuku, int banyak){
        //method untuk melakukan peminjaman (menedit stok, transaksi)
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyak);
        
        buku.editStok(idBuku, buku.getstok(idBuku)-banyak);
    }

    
    public void setPengembalian(Buku buku , int idSiswa , int idBuku, int banyak){
        //method untuk melakukan peminjaman (menedit stok, transaksi)
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyak);
        
        buku.editStok(idBuku, buku.getstok(idBuku)+banyak);
    }
    
    //memanggil id transaksi
    public Integer getidSiswa(int id){
        return this.idSiswa.get(id);
    }
    
    public Integer getidBuku(int id){
        return this.idSiswa.get(id);
    }
    
    public Integer getbanyak(int id){
        return this.banyak.get(id);
    }
    
    //
    public void prosesPeminjaman(){
        
    }
    
}
