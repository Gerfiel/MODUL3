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
public class Universitas {
    private static String namauniv; //ini adalah static variable
    
    
    //ini adalah construktor dengan parameter namauniv
    protected Universitas(String namauniv){
        this.namauniv = namauniv;
    }

    public static String getNamauniv() {
        return namauniv;
    }

    public static void setNamauniv(String namauniv) {
        Universitas.namauniv = namauniv;
    }
}
