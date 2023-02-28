package drHouse;
import java.util.Scanner;

public class drHouse {
	
	//Funciones
	public static String pregunta(String p) {
		//Activo Scanner
		Scanner sc = new Scanner(System.in);
		//Pregunto
		System.out.println(p);
		//Responde el usuario
		String r=sc.nextLine();
		//DEvuelvo la respuesta
		return r;
	}
	
	//Funcion es la decision de donde redirigir al paciente
	public static void departTrauma(String nombre) {
		//Realizar proceso de preguntas trauma
	}
	public static void departImss(String nombre) {
		//Realizar proceso de preguntas Fiebre
	}
	
	
	//Funcion es la decision de donde redirigir al paciente
	public static void triage(String nombre) {
		String respuesta="";
		
		//Preguntamos si se ha caído
		respuesta=pregunta(nombre+" ¿Has sufrido una caída?[S,N]");
		while(!respuesta.equals("S")&&!respuesta.equals("N")) {
			System.out.println("¡No me hagas perder el tiempo!");
			respuesta=pregunta(nombre+" ¿Has sufrido una caída?[S,N]");
		}
		if(respuesta.equals("S")) {
			//TRAUMATOLOGIA
			System.out.println("A trauma");
			departTrauma(nombre);
		}else if(respuesta.equals("N")){
			//Preguntamos si tiene fiebre
			respuesta=pregunta(nombre+" ¿Has tenido fiebre?[S,N]");
			while(!respuesta.equals("S")&&!respuesta.equals("N")) {
				System.out.println("¡No me hagas perder el tiempo!");
				respuesta=pregunta(nombre+" ¿Has tenido fiebre?[S,N]");
			}
			if(respuesta.equals("S")) {
				//IMSS
				System.out.println("Al IMSS");
				departImss(nombre);
			}
		}
		
	}
	

	public static void main(String[] args) {

		//Comienza el proceso
		triage("Ricardo");

	}

}
