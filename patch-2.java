/**
 * @author Daw120
 */
package com.solomongo.ejercicio1;
public class Rectangulo {
  
    //atributos
    private int largo;
    private int ancho;
    
    public Rectangulo(){} // a. constructor sin argumentos.
    
    // b. constructor con dos argumentos:
    public Rectangulo(int largo, int ancho){
    this.largo=largo;
    this.ancho=ancho;
    }
    
    //c. metodos get  y  set 
     public int getLargo()
    {
    return largo;
    }
     
    public int getAncho()
    {
    return ancho;
    }

    public void setLargo(int largo)
    {
    this.largo=largo; 
    }
    
    public void setAncho(int ancho)
    {
    this.ancho=ancho; 
    }  

    // d. metodo get area
    public int getArea()
    {
    return largo*ancho;
    }

    // e. metodo get diagonal
    public double getDiagonal()
    {
    double diagonal;
    return diagonal=largo*Math.sqrt(2);
    }
}
