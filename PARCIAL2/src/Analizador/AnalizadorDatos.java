package Analizador;

import java.util.Scanner;

public class AnalizadorDatos {

    public static void main(String[] args) {
        String Nombre;
        int Edad, i, PI[];
        float Peso, Altura;
        char Sexo;
        boolean ME[];
        PI=new int[4];
        ME=new boolean[4];
        Scanner scan=new Scanner(System.in);
        System.out.print("FAVOR INGRESE LOS SIGUIENTES DATOS\n");
        System.out.print("Nombre:");
        Nombre=scan.next();
        System.out.print("Sexo (H/M):");
        Sexo=scan.next(".").charAt(0);
        System.out.print("Edad:");
        Edad=scan.nextInt();
        System.out.print("Peso (kg):");
        Peso=scan.nextFloat();
        System.out.print("Altura (m):");
        Altura=scan.nextFloat();
        
        DatosPersonas P1=new DatosPersonas(Nombre, Edad, Sexo, Peso, Altura);
        DatosPersonas P2=new DatosPersonas(Nombre, Edad, Sexo);
        DatosPersonas P3=new DatosPersonas();
        
        P1.GenID();
        P2.GenID();
        P3.GenID();
        
        P3.setNombre("Marta");
        P3.setEdad(16);
        P3.setSexo('m');
        P3.setPeso((float) 47.90);
        P3.setAltura((float) 1.57);
        
        PI[1]=P1.CalculoIMC();
        PI[2]=P2.CalculoIMC();
        PI[3]=P3.CalculoIMC();
        
        i=1;
        System.out.println("\nPeso de las personas:");
        while (i<=3) {
            if (PI[i]==-1)
                System.out.println("La persona "+i+" esta por debajo del peso ideal");
            else if (PI[i]==1)
                System.out.println("La persona "+i+" esta en sobrepeso");
            else if (PI[i]==0)
                System.out.println("La persona "+i+" esta en su peso ideal");
            i++;
        }
        
        ME[1]=P1.MayorEdad();
        ME[2]=P2.MayorEdad();
        ME[3]=P3.MayorEdad();
        
        i=1;
        System.out.println("\nEdades de las personas:");
        while (i<=3) {
            if (ME[i]==true)
                System.out.println(""+i+" es mayor de edad");
            else if (ME[i]==false)
                System.out.println(""+i+" es menor de edad");
            i++;
        }
	
        System.out.println("\nPersona 1:\n"+P1.toString());
        System.out.println("\nPersona 2:\n"+P2.toString());
        System.out.println("\nPersona 3:\n"+P3.toString());
        scan.close();
    }
}