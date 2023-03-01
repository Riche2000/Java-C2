package holocaustoH;

public class Habitacion {
	//Tamaño de la habitacion
	public static final int ANCHO=6;
	public static final int ALTO=6;
	
	//Puertas
	private Posicion puertaEntrada;
	private Posicion puertaSalida;
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

}
