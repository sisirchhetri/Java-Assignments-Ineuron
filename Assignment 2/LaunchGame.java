import java.util.Scanner;

class Guesser{
	
	int guessNumb;
	
	public int guessNumb() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser please guess a number (0-9): ");
		guessNumb = sc.nextInt();
		while(guessNumb > 9) {
			System.out.println("Guess a number between 0-9: ");
			guessNumb = sc.nextInt();
		}
		return guessNumb;
	}
}

class Player{
	int pgguessNum;
	String playerName;
	
	
	public int pgguessNumb(String pyName) {
		playerName = pyName;
		Scanner sc = new Scanner(System.in);
		System.out.println(playerName + " please guess a number: ");
		pgguessNum = sc.nextInt();
		while(pgguessNum > 9) {
			System.out.println(playerName+" guess a number between 0-9");
			pgguessNum = sc.nextInt();
		}
		//sc.close();
		return pgguessNum;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	Player player1= new Player();
	Player player2= new Player();
	Player player3= new Player();
	Guesser guesser1 = new Guesser();
	
	void numFromGuesser(){
		Guesser guesser = new Guesser();
		numFromGuesser = guesser.guessNumb();
		
	}
	
	void numFromPlayer() {
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		numFromPlayer1 =player1.pgguessNumb("Player1");
		numFromPlayer2 =player2.pgguessNumb("Player2");
		numFromPlayer3 =player3.pgguessNumb("Player3");
	}
	
	void compareNumber() {
		
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game tied! All players guessed correctly.");
			}
			else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 & 2  won the game. Let go for the Finals");
				
				System.out.println("Welcome to the finals");
				
				numFromGuesser = guesser1.guessNumb();
				numFromPlayer1 = player1.pgguessNumb("Player1");
				numFromPlayer2 = player2.pgguessNumb("Player2");
				
				if(numFromGuesser == numFromPlayer1) System.out.println("Player1 won ");
				else if(numFromGuesser == numFromPlayer2 ) System.out.println("Player2 won");
				else System.out.println("Game Over! Try again");
				
			}
			else if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 & 3 won the game");
				
				System.out.println("Welcome to the finals");
				numFromGuesser = guesser1.guessNumb();
				numFromPlayer1 = player1.pgguessNumb("Player1");
				numFromPlayer3 = player3.pgguessNumb("Player3");
				
				
				
				if(numFromGuesser == numFromPlayer1) System.out.println("Player1 won ");
				else if(numFromGuesser == numFromPlayer3 ) System.out.println("Player3 won");
				else System.out.println("Game Over! Try again");
			}
			else {
				System.out.println("Player 1 won the game");
			}
		}
		
		else if(numFromGuesser == numFromPlayer2) { 
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 & 3 won the game");
				
				System.out.println("Welcome to the finals");
				numFromGuesser = guesser1.guessNumb();
				numFromPlayer2 = player2.pgguessNumb("Player2");
				numFromPlayer3 = player3.pgguessNumb("Player3");
				
				
				
				if(numFromGuesser == numFromPlayer2) System.out.println("Player2 won ");
				else if(numFromGuesser == numFromPlayer3 ) System.out.println("Player3 won");
				else System.out.println("Game Over! Try again");
			}
			
			else {
				System.out.println("Player 2 won the game");
			}
			
		}
		else if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 is the winner");
		}
		else {
			System.out.println("Game lost! try again.");
		}
		
		playAgain();
	}

	public void playAgain() {
		System.out.println("Do you want to play again! : Enter y or n");
		Scanner sc = new Scanner(System.in);
		String play = sc.nextLine();
		
		switch (play) {
		   
		case "y" : System.out.println("Welcome Back To Guesser Game");
				   numFromGuesser();
				   numFromPlayer();
				   compareNumber();
		           break;
		
		case "n"  : System.out.println("Game Over");
					System.exit(0);
		
		default : System.out.println("Invalid input. Enter again :");
				  play = sc.nextLine();
				 
		
		}
	}
	
	
}

public class LaunchGame {

	public static void main(String[] args) {
		
		Umpire umpire = new Umpire();
		umpire.numFromGuesser();
		umpire.numFromPlayer();
		umpire.compareNumber();

	}

}

