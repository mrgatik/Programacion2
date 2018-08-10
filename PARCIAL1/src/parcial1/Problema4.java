/*
Pedir números al usuario y cuando el usuario meta un -1 se termina el programa.
-Mayor número introducido.
-Menor número introducido.
-Suma de todos los números.
-Suma de los números positivos.
-Suma de los números negativos.
-Media de la suma (la primera que pido).
*El numero -1 no contara como número.
 */
package parcial1;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Problema4 {
    
    private static Scanner scanner;
    
    public static void main(String[] args) {
        scanner=new Scanner (System.in);
        Scanner scan=scanner.useLocale(Locale.US);
        DecimalFormat df=new DecimalFormat("0.00");
        df.setMaximumFractionDigits(2);
        double num, Ptivo=0, Ntivo=0, prom=0, ttl=0, mayor=-9999999, menor=9999999;
        int i=0;
        System.out.print("Utilice > -1 < para terminar el programa\n");
        do {
            System.out.print("Ingrese un numero:");
            num=scan.nextDouble();
            if (num!=-1) {
                if (num>mayor)
                    mayor=num;
                if (num<menor)
                    menor=num;
                if (num>0)
                    Ptivo=Ptivo+num;
                if (num<0)
                    Ntivo=Ntivo+num;
                ttl=ttl+num;
                i++;
                } 
	}
        while(num!=-1);
        prom=ttl/i;
        System.out.println("Promedio ingresado:"+prom);
        System.out.println("Maximo valor ingresado:"+mayor);
        System.out.println("Minimo valor ingresado:"+menor);
        System.out.println("Total de la suma de los numeros:"+ttl);
        System.out.println("Suma de valores positivos:"+Ptivo);
        System.out.println("Suma de valores negativos:"+Ntivo);
        scan.close();
    }
}