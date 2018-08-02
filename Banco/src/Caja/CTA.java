package Caja;

import java.text.DecimalFormat;

public class Cta {
	private String NoTitular;
	private String ApTitular;
	private double monto;
		
	public Cta (String NomTitular, String ApeTitular, double monto) {
		this.NoTitular=NomTitular;
		this.ApTitular=ApeTitular;
		this.monto=monto;
	}
	public void setTitular(String NomTitular, String ApeTitular){
		this.NoTitular=NomTitular;
		this.ApTitular=ApeTitular;
	}
	public String getNomTitular() {
		return this.NoTitular;
	}
	public String getApeTitular() {
		return this.ApTitular;
	}
	public void setMonto(double monto) {
		this.monto=monto;
	}
	public double getMonto() {
		return this.monto;
	}
	public void Ingresar(double monto) {
		if (monto>=0)
			this.monto+=monto;
		else
			System.out.println("Cantidad ingresada es menor o igual a B/. 0,00, no hay ingreso a la cuenta");
	}
	public void Retirar (double monto) {
		DecimalFormat d=new DecimalFormat("0,00");
		d.setMaximumFractionDigits(2);
		if (monto>this.monto) {
			System.out.println("Su retiro excede el saldo de la cuenta (B/. "+d.format(this.monto)+"). Su cuenta quedara en B/. 0,00");
			this.monto=0;
		}
		else if (monto<=0)
			System.out.println("Cantidad ingresada es menor o igual a B/. 0,00, no hay ingreso a la cuenta");
		else
			this.monto-=monto;
	}
	public void getString() {
		DecimalFormat df = new DecimalFormat("0,00");
		df.setMaximumFractionDigits(2);
		System.out.println(this.NoTitular+" "+this.ApTitular+" el saldo en su cuenta es de: B/. "+df.format(this.monto));
	}
}