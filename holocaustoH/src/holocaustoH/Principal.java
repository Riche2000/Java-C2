package holocaustoH;

public class Principal {

	public static void main(String[] args) {
		//Generamos una habitacion
		Habitacion habInicial=new Habitacion();
		
		//Posiconamos las puertas de entrada y salida
		Posicion puertaIn=new Posicion(0,3);
		habInicial.setPuertaEntrada(puertaIn);
		Posicion puertaOut=new Posicion(5,Habitacion.ALTO-1);
		habInicial.setPuertaSalida(puertaOut);
		
		//Generamos el jugardor y lo almacenamos en la Habitacion
		Personaje jugador=new Personaje();
		habInicial.setJugador(jugador);
		
		//Pintamos la habitacion
		Juego.pintarHabitacion(habInicial);

	}

}
