package funciones;

public class Principal {
	
	//Funcion - Precio Total
	public static float precioTotal(float precioUd,int usd) {
		//Variables internas
		float precioT;
		
		System.out.println(" ------- Funcion de calculo de precio total de un producto ------- ");
		precioT=precioUd*usd;
		System.out.println("PRECIO TOTAL: "+precioT);
		
		return precioT;
	}

	public static void main(String[] args) {
		//static se van generando los objetos cuando se vayan a necesitar (reserva)
		//main es el nombre por defecto que se usa para el programa
		// Funciones
		
		float precioDeProducto=0f;
		
		precioDeProducto=precioTotal(52.87f,4);
		System.out.println("PRECIO TOTAL: "+precioDeProducto);
	}

}
