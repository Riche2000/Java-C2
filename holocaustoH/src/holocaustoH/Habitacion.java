package holocaustoH;

public class Habitacion {
	private Posicion puertaEntrada;
	
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

}
