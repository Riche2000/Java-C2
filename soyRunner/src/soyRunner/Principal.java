package soyRunner;
import java.util.Scanner;

public class Principal {
	
	//FUNCION DE MENU
	//Menu de trabajo para interactuar con el usuario
	public static int mostrarMenu(boolean error) {
		//Solicitamos al usuario una opcion
		Scanner sc = new Scanner(System.in);
		if(error) System.out.println("INTRODUCE UNICAMENTE UN VALOR [0,1,2,3]");
		System.out.println("---------MENU---------");
		System.out.println("[0] FINALIZAR");
		System.out.println("[1] NUEVO DATO");
		System.out.println("[2] MOSTRAR DATOS");
		System.out.println("[3] BORRAR ULTIMO DATO");
		System.out.println("----------------------");
		System.out.print("TU OPCION [0,1,2,3]-> ");
		int respuesta=sc.nextInt();
		//Si la respuesta no es valida se seguira mstrando
		while(respuesta<0||respuesta>3) respuesta=mostrarMenu(true);
		return respuesta;
	}
	
	//Funcion solicitar un nuevo registro
	public static void nuevoRegistro(float tmpos[], int uReg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introducir el nuevo tiempo en min.seg: ");
		//Capturamos
		float nuevoDato=sc.nextFloat();
		//Almacenamos en el array
		tmpos[uReg]=nuevoDato;
	}
	
	//Mostrar registros
	public static void mostrarRegistros(float tmpos[], int uReg) {
		System.out.println("---------DATOS---------");
		for(int i=0;i<uReg;i++) {
			System.out.println("Dato["+i+"]: "+tmpos[i]);
		}
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		//Definir los arrays de trabajo
		float tiempos[]= {0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f};
		float distancias[]= {0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f};
		String etiquetas[]= {"","","","","","","","","",""};
		int ultRegistro=0;
		
		// Inicializacion de variables
		int respuesta=-1;
		
		respuesta=mostrarMenu(false);

		//Acciones sobre menu
		while(respuesta!=0) {
			switch(respuesta) {
			case 1:
				nuevoRegistro(tiempos,ultRegistro);
				ultRegistro++;
				break;
			case 2:
				mostrarRegistros(tiempos,ultRegistro);
				break;
			case 3:
				//Si hay al menos un registro en el array, lo borramos
				if(ultRegistro > 0) {
					ultRegistro--;
					tiempos[ultRegistro] = 0.0f;
				}
				break;
			}
			//Cuando acabe volvera a mostrar el menu
			respuesta=mostrarMenu(false);
		}
		
	}

}
