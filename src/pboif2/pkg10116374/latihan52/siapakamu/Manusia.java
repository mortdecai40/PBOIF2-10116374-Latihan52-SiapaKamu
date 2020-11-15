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
class Manusia {
    private String nim, kelas, nama;
    private int umur;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
     public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void kelasApa() {
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang belajar"
                + " di kelas " + kelas);
    }

    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
    
}
