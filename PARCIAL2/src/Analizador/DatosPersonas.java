package Analizador;

import java.util.Random;

public class DatosPersonas {
    private String name;
    private int age;
    private String ID;
    private char sex;
    private float weight;
    private float height;
    private char wordID;
    private int numID;
    
    public DatosPersonas() {
        this.name="";
        this.age=0;
        this.ID="";
        this.sex=' ';
        this.weight=0;
        this.height=0;
	}
    
    public DatosPersonas(String Nombre, int Edad, char Sexo) {
        this.name=Nombre;
        this.age=Edad;
        this.ID="";
        this.sex=Sexo;
        this.weight=0;
        this.height=0;
	}
    
    public DatosPersonas(String Nombre, int Edad, char Sexo, float Peso, float Altura) {
        this.name=Nombre;
        this.age=Edad;
        this.ID="";
        this.sex=Sexo;
        this.weight=Peso;
        this.height=Altura;
	}
    
    public int CalculoIMC() {
        double PI;
        int valor;
        PI=(this.weight/(Math.pow(this.height,2)));
        if (PI<20)
            valor=-1;
        else if (PI>=20&&PI<=25)
            valor=0;
            else
            valor=1;
            return valor;
	}
    
    public boolean MayorEdad() {
        if (this.age>=18)
            return true;
                else
                return false;
	}
	
    public char ValorSex(char Sexo){
        if(Sexo=='H'||Sexo=='M'||Sexo=='h'||Sexo=='m')
            System.out.println("Ingreso correcto");
            else
            this.sex='H';
            return this.sex;
	}
	
    public String GenID() {
        Random rng=new Random();
        String letrasDNI="TRWAGMYFPDXBNJZSUVHLCKE";
        this.numID=rng.nextInt(90000000)+10000000;
        int modulo=this.numID%23;
        this.wordID=letrasDNI.charAt(modulo);
        this.ID+=this.numID;
        this.ID+="-";
        this.ID+=this.wordID;
        return this.ID;
	}
	
    public void setNombre(String Nombre) {
	this.name=Nombre;
	}
	
    public void setEdad(int Edad) {
	this.age=Edad;
	}
	
    public void setSexo(char Sexo) {
	this.sex=Sexo;
	}
	
    public void setPeso(float Peso) {
	this.weight=Peso;
	}
	
    public void setAltura(float Altura) {
	this.height=Altura;
	}
	
    public String toString() {
	String Info;
	Info=("Nombre:"+this.name+"\nEdad:"+this.age+"\nSexo:"+this.sex+"\nCedula:"+this.ID+"\nPeso:"+this.weight+"\nAltura:"+this.height);
	return Info;
	}
}