package perpustakaan;

import java.util.ArrayList;

public class Buku {
    //arraylist
    private final ArrayList<String> namaBuku = new ArrayList<String>();
    private final ArrayList<Integer> stok = new ArrayList<Integer>();
    private final ArrayList<Integer> harga = new ArrayList<Integer>();
    
    //constructor 
    public Buku(){
        this.namaBuku.add("Programming");
        this.stok.add(20);
        this.harga.add(250000);

        this.namaBuku.add("Webdev");
        this.stok.add(7);
        this.harga.add(310000);

        this.namaBuku.add("Matematika");
        this.stok.add(12);
        this.harga.add(76000);

        this.namaBuku.add("History");
        this.stok.add(19);
        this.harga.add(110000);
    }
    
    public void setnamaBuku(String nama){
        this.namaBuku.add(nama);
    }
    
    public void setstok(Integer stok){
        this.stok.add(stok);
    }
    
    public void setharga(Integer harga){
        this.harga.add(harga);
    }
    
    public String getnamaBuku(int id){
        return this.namaBuku.get(id);
    }
    
    public Integer getstok(int id){
        return this.stok.get(id);
    }
    
    public Integer getnharga(int id){
        return this.harga.get(id);
    }
    
    //jumlbuku
    public Integer getjmlBuku(){
        return this.namaBuku.size();
    }
    
    //edit stok
    //digunakan untuk mengedit stok = nanti di peminjaman.
    public int editStok(int idBuku , int stok){
        return this.stok.set(idBuku , stok);
    }
}
