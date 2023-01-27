
package com.mycompany.tddpruebas;


public class Coche {
    public String modelo;
    public float precioBase;
    public static float impuesto; //porcentaje entre 0 y 100
    
    public Coche (String modelo, float precioBase){
        this.modelo = modelo;
        this.precioBase = precioBase;
    }
    
    public float precioFinal(float descuento) {
        if(descuento < 0 || descuento > 100)
            throw new IllegalArgumentException("Descuento erroneo");
        float precioConDescuento = this.precioBase;
        if(precioBase >= 5000){
            precioConDescuento = this.precioBase -(this.precioBase * descuento/100f);
        }
        return precioConDescuento  + precioConDescuento  * this.impuesto/100f;
    }
    
}
