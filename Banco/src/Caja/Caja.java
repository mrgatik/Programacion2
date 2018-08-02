package Caja;

import java.util.Locale;
import java.util.Scanner;

public class caja {
	private static Scanner scanner;

	public static void main(String[] args) {
		String Nom=" ", Ape=" ", continuar;
		double monto=0;
		int sel=0;
		Cuenta Cta=new Cuenta(Nom, Ape, monto);
		scanner=new Scanner(System.in);
		Scanner scan=scanner.useLocale(Locale.US);
		do {
		System.out.println("Sistema de manejo de cuentas bancarias\n");
		System.out.print("Escoja una opción \n1. Comenzar una Cuenta\n2. Ingreso de dinero a cuenta\n3. Retiro de dinero a cuenta\n4. Informacion de cuenta\n\nSeleccione: ");
		sel=scan.nextInt();
		switch(sel) {
		case 1:
			System.out.print("\nIngrese el nombre y apellido del portador de la Cuenta:");
			Nom=scan.next();
			Ape=scan.next();
			Cta.setTitular(Nom, Ape);
			System.out.print("Ingrese el valor que posee la cuenta: ");
			monto=scan.nextDouble();
			Cta.setMonto(monto);
			break;
		case 2:
			if (Nom.equals(" ") && Ape.equals(" ")&& monto==0)
				System.out.println("No ha inicializado la cuenta");
			else {
				System.out.print("\nMonto a ingresar a la cuenta: ");
				monto=scan.nextDouble();
				Cta.Ingresar(monto);
				}
			break;
		case 3:
			if (Nom.equals(" ")&&Ape.equals(" ")&&monto==0)
				System.out.println("No ha inicializado la cuenta");
			else {
				System.out.print("\nMonto a retirar de la cuenta: ");
				monto = scan.nextDouble();
				Cta.Retirar(monto);
				}
			break;
		case 4:
			if (Nom.equals(" ")&&Ape.equals(" ")&&monto==0)
				System.out.println("No ha inicializado una cuenta");
			else {
			Nom=Cta.getNomTitular();
			Ape=Cta.getApeTitular();
			monto=Cta.getMonto();
			Cta.getString();
			}
			break;
		default:
			System.out.println("Seleccion Invalida");
			break;
		}
		System.out.print("\n¿Desea regresar al menu? (S/N):");
		continuar=scan.next();
		} while (continuar.equals("SI")||continuar.equals("si")||continuar.equals("Si")||continuar.equals("sI")||continuar.equals("S")||continuar.equals("s"));
		scan.close();
		System.out.println("\t-------Gracias por confiar en nosotros-------");
	}
}