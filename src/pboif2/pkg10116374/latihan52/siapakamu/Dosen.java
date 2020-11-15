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
class Dosen extends Manusia {
    private String nip, mataKuliah, nama1;
    private int umur1;
    
     public int getUmur() {
        return umur1;
    }

    public void setUmur(int umur1) {
        this.umur1 = umur1;
    }
    
    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public String getNama() {
        return nama1;
    }

    public void setNama(String nama1) {
        this.nama1 = nama1;
    }
    
    public void mengajarApa() {
        System.out.println("Saya "+nama1+" umur "+umur1+" tahun sedang mengajar"
                + " matakuliah " + mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }

}
