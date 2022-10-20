/*
1.- Diseña una clase llamada Rectangulo que contenga:

• Dos atributos privados de tipo entero: largo y ancho

• Y los siguientes métodos públicos:

a. Un constructor que permita declarar objetos sin argumentos.
b. Un constructor que permita declarar objetos con dos argumentos (largo y ancho)
c. Métodos selectores (get) y modificadores (set)
d. Un método llamado area que devuelve el área del rectángulo
e. Un método llamado diagonal que devuelve el valor de la diagonal (con decimales)

Desde el método main() de la clase principal probar su funcionamiento.
*/
package com.solomongo.ejercicio1;
public class Ejercicio1 {
    public static void main(String[] args) {
       
    Rectangulo aux=new Rectangulo();  
    aux.setLargo(22);
    aux.setAncho(10);
 
  System.out.print("-------RECTANGULO-------\n\n- Largo: ");
  System.out.print(aux.getLargo());  
  System.out.print("\n- Ancho: "+aux.getAncho());
  System.out.print("\n\nArea: "+aux.getArea()+"\nDiagonal: ");
  System.out.printf("%,.1f",aux.getDiagonal());

    }
}
