package calculadorav2;

public class Operadores {	
	
	protected static float num1;
	protected static float num2;
	
	public Operadores (float numero1, float numero2) {
            num1 = numero1;
            num2 = numero2;
	}
	
	public void setNum1 (float numero1) {
            num1 = numero1;
	}
	public float getNum1 () {
            return num1;
	}
	public void setNum2 (float numero2) {
            num2 = numero2;
	}
	public float getNum2 () {
            return num2;
	}
}