package yoRobot;

public class Robot {
	
	//Propiedades
	private float peso;
	
	//Piezas del robot
	Pieza sinIdentificar;
	CPU cpu;
	Bateria bateria;
	
	//Constructor
	public Robot() {
		this.cpu=new CPU();
		this.cpu.setNumSerie("rics5500ART");
		this.bateria=new Bateria();
		this.bateria.setPeso(250f);
	}
	
	//metodos GETTERS & SETTERS
	public void setPeso(float p) {
		if(p<0) peso=0;
		else peso=p;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
}
