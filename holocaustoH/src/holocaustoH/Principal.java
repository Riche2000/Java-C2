package holocaustoH;

public class Principal {

	public static void main(String[] args) {
		
		//Posicion posInicial=new Posicion();
		//posInicial.setPosX(3);
		//posInicial.setPosY(0);
		Posicion posInicial=new Posicion(3,0);
		
		//Generaremos los dos primeros objetos
		Habitacion hab1=new Habitacion();
		Personaje jugador=new Personaje();
		jugador.setPos(posInicial);
		
		
		Juego.pintarHabitacion(hab1);

	}

}
