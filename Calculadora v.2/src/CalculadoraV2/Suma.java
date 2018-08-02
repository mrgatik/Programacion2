package calculadorav2;

public class suma extends Operadores {	

    private float t;
    private char sig;
    private String oper;

	public suma (float numero1, float numero2) {
	super(numero1, numero2);
            }
	
	public float getRes () {
            t=num1+num2;
            return t;
	}
	public String getOperation() {
            oper="suma";
            return oper;
	}
	public char getSign() {
            sig='+';
            return sig;
	}
}