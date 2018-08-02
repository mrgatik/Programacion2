import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	
		Scanner read= new Scanner(System.in);
		int opt=0, n1=0, n2=0, r=0;
		
		System.out.println("-Elije la operacion-");
		System.out.println("1. (+) Suma");
		System.out.println("2. (-) Resta");
		System.out.println("3. (*) Multiplación");
		System.out.println("4. (/) División");
                System.out.println("\nIngrese la opción:");
                opt = read.nextInt();
		System.out.println("\nInserte el primer número");
		n1 =read.nextInt();
		System.out.println("Inserte el segundo número");
		n2 =read.nextInt();
		switch(opt) {
		case 1:
			r=n1+n2;
			System.out.println("\nEl resultado de la suma es: "+r);
		    break;
		case 2:
			r=n1-n2;
			System.out.println ("\nEl resultado de la resta es: "+r);
			break;
		case 3:
			r=n1*n2;
			System.out.println("\nEl resultado de la multiplicacion es: "+r);
			break;
		case 4:
			r=n1/n2;
			System.out.println("\nEl resultado de la division es: "+r);
			break;
		}
	}
}