package calculadorav2;

import java.util.Scanner;

public class CalculadoraV2 {

  public static void main(String[] args) {
		float num1=0, num2=0, ttl=0;
		char sign=' ';
		String op=" ", continuar;
                char sign=' ';
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("-Escoja una operación-");
                        System.out.println("1. (+) Suma");
                        System.out.println("2. (-) Resta");
                        System.out.println("3. (*) Multiplación");
                        System.out.println("4. (/) División");
                        System.out.println("Selección:");
                        sel = scan.nextInt();
			if (sel<=4 && sel>0){
				resp=1;
				System.out.print("\n Primer numero:\t");
				num1=scan.nextFloat();
				System.out.print("Segundo numero:\t");
				num2=scan.nextFloat();
				switch(sel) 
				{
				case 1: 
					suma s=new suma(num1, num2);
					ttl=s.getRes();
					sign=s.getSign();
					op=s.getOperation();
					break;
				case 2:
					resta r=new resta(num1, num2);
					ttl=r.getRes();
					sign=r.getSign();
					op=r.getOperation();
					break;
				case 3:
					multiplicacion m=new multiplicacion(num1, num2);
					ttl=m.getRes();
					sign=m.getSign();
					op=m.getOperation();
					break;
				case 4:
					if (num2==0) {
						System.out.println("No es divisible entre 0");
						resp=0;
						break;
					}
					else {
                                                division d=new division(num1, num2);
						ttl=d.getRes();
						sign=d.getSign();
						op=d.getOperation();
						break;
					}	
				default:
					System.out.println("Invalido");
					break;
                                }
                            if (resp==1) {
                                System.out.println("\nLa "+op+" "+num1+" "+sign+" "+num2+" es igual a:");
                                System.out.print(ttl);
				}
			}
			else
				System.out.println("\nInvalido");
			System.out.print("\nDesea continuar? (S/N): ");
			continuar=scan.next();
			} while (continuar.equals("SI")||continuar.equals("si")||continuar.equals("Si")||continuar.equals("sI")||continuar.equals("S")||continuar.equals("s"));
		scan.close();
		}
	}