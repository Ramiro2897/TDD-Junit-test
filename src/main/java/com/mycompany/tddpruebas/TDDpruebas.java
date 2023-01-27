
package com.mycompany.tddpruebas;


public class TDDpruebas {

    public static void main(String[] args) throws Exception{
        Coche p = new Coche("Audi", 10000);
        Coche.impuesto = 20f;
        System.out.println("Precio final: " + p.precioFinal(110f));
    }
}
