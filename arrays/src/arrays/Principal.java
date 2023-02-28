package arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Definicion de arrays
		//Los arrays puede almacenar un ocnjunto de varibles pero del mismo tipo
		//Tipo Nombre[] {};
		String nombres[]= {"Ricardo","Carmen","Luis","Jorge","Alejandro",""};
		//						0		1		2		3		4		  5
		float calificaciones[]=new float[10];
		
		calificaciones[0]=3.45f;
		//System.out.println(nombres[0]);
		//System.out.println(nombres[1]);
		

		//Activo el Scanner
		Scanner sc = new Scanner(System.in);
		//Pregunto
		System.out.println("¿Cual es el nuevo nombre?");
		//Responde el usuario
		String nombreFinal = sc.nextLine();
		//Almaceno
		nombres[nombres.length-1]=nombreFinal;
		
		//Recorrer los elementos de un array
		for(int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		} 

	}

}
