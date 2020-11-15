/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116374.latihan52.siapakamu;

/**
 *
 * @author Acromyrmex
 */
class Mahasiswa extends Manusia {
  private String nim, kelas, nama2;
  private int umur2;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNama() {
        return nama2;
    }
    
    public void setNama(String nama2) {
        this.nama2 = nama2;
    }  
    
     public int getUmur() {
        return umur2;
    }

    public void setUmur(int umur2) {
        this.umur2 = umur2;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa() {
        System.out.println("Saya "+nama2+" umur "+umur2+" tahun sedang belajar"
                + " di kelas " + kelas);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }

}
