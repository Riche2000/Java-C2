package rickyRubio;

public class Principal {

	public static void main(String[] args) {
		// Datos personales
		String nombre="Ricky";
		String apellido="Rubio";
		
		//Datos equipo
		short dorsal=13;
		String equipo="Cavaliers";
		
		//Termporada 21-22
		float puntosPartido=13.1f;
		boolean lesionado=true;
		
		//Imprimimos en pantalla
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("----------------------");
		System.out.println();
		System.out.println("Datos de equipo");
		System.out.println("Dorsal: "+dorsal);
		System.out.println("Equipo: "+equipo);
		System.out.println("----------------------");
		System.out.println();
		System.out.println("Temporada");
		System.out.println("Puntos del partido: "+puntosPartido);
		System.out.println("¿Esta lesionado? "+lesionado);
	}

}
