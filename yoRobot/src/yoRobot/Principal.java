package yoRobot;

public class Principal {

	public static void main(String[] args) {
		int edad=22;
		
		Robot r=new Robot();
		Robot ricardo=new Robot();
		
		//Objetos
		//r.peso=120.67f;
		r.setPeso(12.167f);
		//ricardo.peso=-120.20f;
		ricardo.setPeso(-198.50f);
		
		System.out.println(r.getPeso());
		System.out.println(ricardo.getPeso());
		
		

	}

}
