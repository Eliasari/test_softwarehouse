/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

public class Siswa implements User{
    //array list
    private final ArrayList<String> nama = new ArrayList<String>();
    private final ArrayList<String> alamat = new ArrayList<String>();
    private final ArrayList<String> telepon = new ArrayList<String>();
    private final ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    //menambahkan data pada class siswa sesuai dengan variabel arraylist
    public Siswa(){
        this.nama.add("Elia");
        this.alamat.add("Blitar");
        this.telepon.add("09283927843");
        this.status.add(true);
        
        this.nama.add("Fadilla");
        this.alamat.add("Blitar");
        this.telepon.add("934863724");
        this.status.add(true);
        
        this.nama.add("Cessa");
        this.alamat.add("Blitar");
        this.telepon.add("q52673267349");
        this.status.add(false);
    }
    
    //sama aja kaya length = nge loop
    public int getjmlSiswa(){
        return this.nama.size();
    }

    @Override
    public void setNama(String nama) {
        this.nama.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.nama.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    //status
    public void setStatus(Boolean status) {
        this.status.add(status);
    }
    
    public Boolean getStatus(int id) {
        return this.status.get(id);
    }
    
    //menambahkan editstatus yang akan mengarah ke peminjaman
    public void editstatus(int idSiswa, boolean status){
        this.status.set(idSiswa,status);
    }
}
