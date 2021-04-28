/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_pbo;

import java.util.Scanner;

/**
 *
 * @author DITO
 */
public class Modul3_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lagi = "Y";
        while(lagi.equals("Y")){
            
            Scanner input = new Scanner(System.in);
            Scanner input1 = new Scanner(System.in);
             
            System.out.println("====================================");
            System.out.println("        PILIH NAMA UNIVERSITAS      ");
            System.out.println("====================================");
            System.out.println("1. UNIVERSITAS TRUNOJOYO MADURA");
            System.out.println("2. UNIVERSITAS NEGERI MALANG");
            System.out.println("3. UNIVERSITAS AIRLANGGA");
            System.out.println("4. UNIVERSITAS SEBELAS MARET");
            System.out.println("5. UNIVERSITAS INDONESIA");
            System.out.println("====================================");
            System.out.print("PILIH   : ");
            int PilihUniv;
            PilihUniv = input1.nextInt();
            if (PilihUniv == 1){
                DataMahasiswa.setNamauniv("UNIVERSITAS TRUNOJOYO MADURA"); 
            }
            else if (PilihUniv == 2){
                DataMahasiswa.setNamauniv("UNIVERSITAS NEGERI MALANG"); 
            }
            else if (PilihUniv == 3){
                DataMahasiswa.setNamauniv("UNIVERSITAS AIRLANGGA"); 
            }
            else if (PilihUniv == 4){
                DataMahasiswa.setNamauniv("UNIVERSITAS SEBELAS MARET"); 
            }
            else if (PilihUniv == 5){
                DataMahasiswa.setNamauniv("UNIVERSITAS INDONESIA"); 
            }
            else {
                DataMahasiswa.setJurusan("UNIVERSITAS YANG DIMASUKKAN TIDAK ADA");
            }
            System.out.println("====================================");
            System.out.println("        INPUT DATA MAHASISWA        ");
            System.out.println("====================================");
            System.out.print("NIM           : ");
            DataMahasiswa.setNim(input.nextLine());
            System.out.print("NAMA          : ");
            DataMahasiswa.setNama(input.nextLine().toUpperCase());
            System.out.print("ALAMAT        : ");
            DataMahasiswa.setAlamat(input.nextLine().toUpperCase());
            System.out.println("JURUSAN    : ");
            System.out.println("    61. MATEMATIKA");
            System.out.println("    62. BIOLOGI");
            System.out.println("    63. KIMIA");
            System.out.println("    64. FISIKA");
            System.out.println("    65. TEKNIK INFORMATIKA");
            System.out.println("    66. SISTEM INFORMASI");
            System.out.print("PILIH JURUSAN   : ");
            int pilihan;
            pilihan = input1.nextInt();
            if (pilihan == 61){
                DataMahasiswa.setJurusan("MATEMATIKA"); 
            }
            else if (pilihan == 62){
                DataMahasiswa.setJurusan("BIOLOGI"); 
            }
            else if (pilihan == 63){
                DataMahasiswa.setJurusan("KIMIA"); 
            }
            else if (pilihan == 64){
                DataMahasiswa.setJurusan("FISIKA"); 
            }
            else if (pilihan == 65){
                DataMahasiswa.setJurusan("TEKNIK INFORMATIKA"); 
            }
            else if (pilihan == 66){
                DataMahasiswa.setJurusan("SISTEM INFORMASI"); 
            }
            else {
                DataMahasiswa.setJurusan("JURUSAN YANG DIPILIH TIDAK ADA");
            }
            
            System.out.println("");
            System.out.println("==========================================");
            System.out.println("              DATA MAHASISWA              ");
            System.out.println("==========================================");
            System.out.println("UNIVERSITAS : " +DataMahasiswa.getNamauniv());
            System.out.println("NIM         : " +DataMahasiswa.getNim());
            System.out.println("NAMA        : " +DataMahasiswa.getNama());
            System.out.println("ALAMAT      : " +DataMahasiswa.getAlamat());
            System.out.println("JURUSAN     : " +DataMahasiswa.getJurusan());
            System.out.println("==========================================");
            
            System.out.println("");
            System.out.print("Mau lagi (Y/T) ?");
            Scanner x = new Scanner(System.in);
            lagi = x.nextLine().toUpperCase();
            System.out.println("");
        }
            System.out.println("TERIMA KASIH :) ");
        }
    
    
}
