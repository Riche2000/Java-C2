package pigCerdo;
import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int playerScore = 0;
        int computerScore = 0;
        boolean playerTurn = true;
        boolean gameOver = false;
        
        System.out.println("Bienvenido al juego Pig de cerdo. ¡Gana el primero que llega a 100!");
        
        while (!gameOver) {
            if (playerTurn) {
                System.out.println("Tu turno.");
                int turnScore = 0;
                boolean keepRolling = true;
                
                while (keepRolling) {
                    System.out.println("Tirando el dado...");
                    int roll = rand.nextInt(6) + 1;
                    System.out.println("Obtuviste un " + roll);
                    
                    if (roll == 1) {
                        System.out.println("¡Has sacado un 1! Pierdes los puntos acumulados en este turno.");
                        turnScore = 0;
                        keepRolling = false;
                    } else {
                        turnScore += roll;
                        System.out.println("Tu puntuación en este turno es: " + turnScore);
                        System.out.print("¿Quieres seguir tirando? (s/n) ");
                        String answer = sc.next();
                        if (answer.equals("n")) {
                            keepRolling = false;
                        }
                    }
                }
                
                playerScore += turnScore;
                System.out.println("Tu puntuación total es: " + playerScore);
                
                if (playerScore >= 100) {
                    System.out.println("¡Felicidades, has ganado!");
                    gameOver = true;
                } else {
                    playerTurn = false;
                }
            } else {
                System.out.println("Turno de la máquina.");
                int turnScore = 0;
                boolean keepRolling = true;
                
                while (keepRolling) {
                    System.out.println("La máquina está tirando el dado...");
                    int roll = rand.nextInt(6) + 1;
                    System.out.println("La máquina ha obtenido un " + roll);
                    
                    if (roll == 1) {
                        System.out.println("¡La máquina ha sacado un 1! Pierde los puntos acumulados en este turno.");
                        turnScore = 0;
                        keepRolling = false;
                    } else {
                        turnScore += roll;
                        System.out.println("La puntuación de la máquina en este turno es: " + turnScore);
                        if (turnScore >= 20 || computerScore + turnScore >= 100) {
                            System.out.println("La máquina decide detenerse.");
                            keepRolling = false;
                        }
                    }
                }
                
                computerScore += turnScore;
                System.out.println("La puntuación total de la máquina es: " + computerScore);
                
                if (computerScore >= 100) {
                    System.out.println("Lo siento, la máquina ha ganado.");
                    gameOver = true;
                } else {
                    playerTurn = true;
                }
            }
        }

	}

}
