package yoRobot;

public class Robot {
	//Propiedades
	
	//peso solo se puede acceder si estoy dentro de la misma clase
	private float peso;
	
	public Robot() {
		
	}
	//metodos GETTERS & SETTERS
	public void setPeso(float p) {
		if(p<0) peso=0;
		else peso=p;
	}
	
	public float getPeso() {
		return peso;
	}
	
}
