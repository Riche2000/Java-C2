package holocaustoH;

public class Juego {

	public Juego() {
		// TODO Auto-generated constructor stub
	}
	//Metodo
	public static void pintarHabitacion(Habitacion h) {
		for(int fil=0;fil<Habitacion.ALTO;fil++) {
			for(int col=0;col<Habitacion.ANCHO;col++) {
				if(col==0||col==Habitacion.ANCHO-1) System.out.print("|"); //Paredes izquierda y derecha
				else if(fil==0||fil==Habitacion.ALTO-1) System.out.print("="); //Paredes primera y ultima fila
				else System.out.print(" "); //Mapa
				
				if(col==Habitacion.ANCHO-1) System.out.println(); //Siguiente linea
			}
		}
	}

}