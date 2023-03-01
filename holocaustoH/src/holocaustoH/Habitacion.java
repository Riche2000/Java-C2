package holocaustoH;

public class Habitacion {
	//Tamaño de la habitacion
	public static final int ANCHO=10;
	public static final int ALTO=10;
	
	//Puertas
	//Las puertas deben estar en cualquiera de las cuatro paredes
	//Por lo tanto en su posicion deberan siempre contener un 0 o un ANCO-1 o un ALTO-1
	private Posicion puertaEntrada;
	private Posicion puertaSalida;
	
	//Hacemos una copia del jugador
	private Personaje j;
	
	//metodo
	public Habitacion() {
		System.out.println("Creacion de una habitacion");
	}


	//GETTERS Y SETTERS
	public Posicion getPuertaEntrada() {
		return puertaEntrada;
	}

	public void setPuertaEntrada(Posicion puertaEntrada) {
		this.puertaEntrada = puertaEntrada;
	}
	
	public Posicion getPuertaSalida() {
		return puertaSalida;
	}

	public void setPuertaSalida(Posicion puertaSalida) {
		this.puertaSalida = puertaSalida;
	}
	
	public void setJugador(Personaje j) {
		this.j = j;
	}
	
	public boolean esunaPuerta(Posicion p) {
		if(p.esIgual(puertaEntrada)||p.esIgual(puertaSalida)) return true;
		return false;
	}

}
