# U2-Hoja7-EJERCICIO-1
JAVA POO Rectangulo: Diagonal y área

1.- Diseña una clase llamada Rectangulo que contenga:

• Dos atributos privados de tipo entero: largo y ancho

• Y los siguientes métodos públicos:

a. Un constructor que permita declarar objetos sin argumentos.
b. Un constructor que permita declarar objetos con dos argumentos (largo y ancho)
c. Métodos selectores (get) y modificadores (set)
d. Un método llamado area que devuelve el área del rectángulo
e. Un método llamado diagonal que devuelve el valor de la diagonal (con decimales)

Desde el método main() de la clase principal probar su funcionamiento.

```java

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

```
![7](https://user-images.githubusercontent.com/80227002/197076701-92fe6ccd-a69f-4582-b971-f28099fa69a9.png)

```java
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

```
