/*Pide un numero por teclado e indica si es un numero primo o no. Un numero primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5,
sin embargo, 17 si es primo. Un buen truco para calcular la raiz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo
 */
package parcial1;

import java.util.Scanner;

public class Problema3 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0, x, num;
        System.out.println("¿Numero primo o no? \nIngrese un numero para verificar:");
        num=sc.nextInt();
        for(x=1;x<(num+1);x++){
            if(num%x==0){
                i++;
            }
        }
        if(i!=2){
            System.out.println("no es primo");
        }
            else{
            System.out.println("es primo");
            }
        }
}