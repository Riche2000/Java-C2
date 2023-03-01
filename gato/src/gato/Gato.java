package gato;

import java.util.Scanner;

public class Gato {
    private char[][] tablero;
    private boolean turnoMaquina;

    public Gato() {
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
        turnoMaquina = false;
    }

    public void imprimirTablero() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }


    public boolean marcarCasilla(int fila, int columna, char simbolo) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
            tablero[fila][columna] = simbolo;
            return true;
        } else {
            return false;
        }
    }

    public boolean hayGanador(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo) {
                return true;
            }
            if (tablero[0][i] == simbolo && tablero[1][i] == simbolo && tablero[2][i] == simbolo) {
                return true;
            }
        }
        if (tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo) {
            return true;
        }
        if (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo) {
            return true;
        }
        return false;
    }

    public boolean estaLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean turnoUsuario() {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        do {
            System.out.print("Introduce la fila (0-2): ");
            fila = scanner.nextInt();
            System.out.print("Introduce la columna (0-2): ");
            columna = scanner.nextInt();
        } while (!marcarCasilla(fila, columna, 'X'));
        imprimirTablero();
        return hayGanador('X');
    }

    public boolean turnoMaquina() {
        int fila, columna;
        do {
            fila = (int) (Math.random() * 3);
            columna = (int) (Math.random() * 3);
        } while (!marcarCasilla(fila, columna, 'O'));
        System.out.println("La maquina ha seleccionado la fila " + fila + " y la columna " + columna);
        imprimirTablero();
        return hayGanador('O');
    }
    
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean hayGanador = false;
        int opcion;

        do {
            System.out.println("----Juego del Gato----");
            System.out.println("1. Jugar contra la máquina");
            System.out.println("2. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Inicia el juego contra la máquina...");
                    System.out.print("Elige una casilla para marcar con X (fila,columna):");
                    imprimirTablero();
                    while (!hayGanador && !estaLleno()) {
                        hayGanador = turnoUsuario();
                        if (!hayGanador) {
                            hayGanador = turnoMaquina();
                        }
                    }
                    if (hayGanador) {
                        System.out.println("¡Felicidades! Has ganado el juego.");
                    } else {
                        System.out.println("Empate. El juego ha terminado en un empate.");
                    }
                    resetearTablero();
                    hayGanador = false;
                    break;
                case 2:
                    System.out.println("¡Gracias por jugar al Gato!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 2);

    }

    public void resetearTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public static void main(String[] args) {
        Gato juego = new Gato();
        juego.jugar();
    }

}
   
