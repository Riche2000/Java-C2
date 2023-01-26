package cartLuminoso;

public class Principal {

	public static void main(String[] args) {
		//Cartel Luminoso
		int anchura=5;
		int altura=7;
		
		for(int fila=1;fila<=altura;fila++) {
			//System.out.println("fila="+fila);
			//Bucle anidado
			for(int columna=1;columna<=anchura;columna++) {
				if((columna==1)&&(fila!=7)) {
					System.out.print("*");
				}
				//Comprobamos que estemos en fila 7
				else if(fila==7) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
