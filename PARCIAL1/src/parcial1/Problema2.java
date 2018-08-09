/*
Muestra los numeros del 1 al 100 (ambos incluidos). Usa un bucle while.
*/
package parcial1;

public class Problema2 {
    
    public static void main(String[] args){
        int num=1; //Variable iniciada
        System.out.println("Mostrar los numeros del 1 al 100");
        while (num<=100) //Comienza el ciclo
            {
            System.out.println(num);
            num++; //Incremento al contador por ciclo
            }
    }
}