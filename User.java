/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

public interface User {
    //merupakan kelas abstrak yang nantinya akan diimplement ke class Siswa dan petugas
    //membuat method setter
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
    
    //membuat method getter
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);

    
}
