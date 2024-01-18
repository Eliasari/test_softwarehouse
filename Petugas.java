/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

public class Petugas implements User{
    //array list
    private final ArrayList<String> nama = new ArrayList<String>();
    private final ArrayList<String> alamat = new ArrayList<String>();
    private final ArrayList<String> telepon = new ArrayList<String>();
    
    //menambahkan data pada class siswa sesuai dengan variabel arraylist
    public Petugas(){
        this.nama.add("Petugas Admin Sungkono");
        this.alamat.add("Blitar");
        this.telepon.add("09283927843");
    }
    
    //sama aja kaya length = nge loop
    public int getjmlPetugas(){
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
}
