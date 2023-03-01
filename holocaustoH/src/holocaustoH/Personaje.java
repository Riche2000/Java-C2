package holocaustoH;

public class Personaje {
	//Propiedades privadas
	private String nombre;
	private Posicion pos;

	//Metodo
	public Personaje() {
		System.out.println("Creacion de un personaje");
	}
	
	//GETTERS Y SETTERS
	//Usar this. es una buena practica
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posicion getPos() {
		return pos;
	}

	public void setPos(Posicion pos) {
		this.pos = pos;
	}

}
