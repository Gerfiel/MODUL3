/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_pbo;

/**
 *
 * @author DITO
 */
public class DataMahasiswa extends Universitas {
    private static String nim;
    private static String nama;
    private static String alamat;
    private static String jurusan;
    

    public DataMahasiswa(String univ, String nim, String nama, String alamat, String jurusan) {
        super(univ);
        
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
        
    }

    public static String getNim() {
        return nim;
    }

    public static void setNim(String nim) {
        DataMahasiswa.nim = nim;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        DataMahasiswa.nama = nama;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        DataMahasiswa.alamat = alamat;
    }

    public static String getJurusan() {
        return jurusan;
    }

    public static void setJurusan(String jurusan) {
        DataMahasiswa.jurusan = jurusan;
    }
}
