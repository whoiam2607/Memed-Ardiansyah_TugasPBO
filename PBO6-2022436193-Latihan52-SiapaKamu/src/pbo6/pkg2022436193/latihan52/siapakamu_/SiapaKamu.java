/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2022436193.latihan52.siapakamu_;
/**
 *
 * @author
 * Nama : Harris Munahar
 * Kelas : PBO FS112B
 * NIM : 2022436193
 */
public class SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Dosen D;
        Mahasiswa Mh;
        Manusia M;
        
        D = new Dosen();
        Mh = new Mahasiswa();
        M = new Manusia();
        
        D.setNip("412278299930");
        D.setNama("Rizki Adam Kurniawan");
        D.setUmur(27);
        D.setMatakuliah("PBO");
        
        System.out.println("Nip Dosen: " + D.getNip());
        D.Siapakamu();
        D.MengajarApa(D.getNama(), D.getUmur());
        
        Mh.setNama("Memed Ardiansyah");
        Mh.setUmur(23);
        Mh.setNim("2022436193");
        Mh.setKelas("PBO6");
        
        System.out.println();
        System.out.println("Nim Mahasiswa: " + Mh.getNim());
        Mh.SiapaKamu();
        Mh.KelasApa(Mh.getKelas());
        
        System.out.println();
        M.Siapakamu();
        
        
        // TODO code application logic here
    }
}
