/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2022436193.latihan56.umurbarangantik;

/**
 *
 * @author Funtsu
 */
public class Radio extends  BarangAntik {

    /**
     * @param args the command line arguments
     */
    private String name;
    
    public Radio (int umur) {
        super(umur);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
