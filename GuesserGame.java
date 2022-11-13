import java.util.*;
class Guesser{
	int guessNum;
	int guess() {
		Scanner a=new Scanner(System.in);
		System.out.println("Guess the Number from  1 to 9");
		guessNum=a.nextInt();
		if(guessNum>=10) {
			System.out.println("Please enter the correct number");
			System.exit(0);
		}
		return guessNum;
  }
}	
class Player{
	int guess;
	String name;
	String playerName() {
		System.out.println("Enter the name of the Player");
		Scanner n=new Scanner(System.in);
		name=n.next();
		return name;
	}
	
	int number() {
		Scanner a=new Scanner(System.in);
		System.out.println("Player guess the number from 1 to 9");
		guess=a.nextInt();
		if(guess>=10) {
			System.out.println("Please enter the correct number");
			System.exit(0);
		}
		return guess;
	}

}

	class Umpire{
		int numFromGuesser;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;
		String nameOfPlayer1;
		String nameOfPlayer2;
		String nameOfPlayer3;
		int tiedPlayer1;
		int tiedPlayer2;
		void guesser() {
			Guesser b=new Guesser();
			numFromGuesser=b.guess();
		}
		void name() {
			Player k=new Player();
			nameOfPlayer1=k.playerName();
			nameOfPlayer2=k.playerName();
			nameOfPlayer3=k.playerName();
		}
		void player(){
			Player c=new Player();
			numFromPlayer1=c.number();
			numFromPlayer2=c.number();
			numFromPlayer3=c.number();
		}
		void tie() {
			System.out.println("One last chance");
			Guesser b=new Guesser();
			numFromGuesser=b.guess();
			Player d=new Player();
			Player c=new Player();
			tiedPlayer1=d.number();
			tiedPlayer2=c.number();
		}
		void compare() {
			if(numFromGuesser==numFromPlayer1) {
				if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
					System.out.println("All Won the game");
			}
				else if(numFromGuesser==numFromPlayer2)
				{
						System.out.println("Tie between "+nameOfPlayer1+" and "+ nameOfPlayer2);
						tie();
						
						 if(numFromGuesser==tiedPlayer1) {
							System.out.println(nameOfPlayer1+" Won the game");
						}
						 else {
						System.out.println(nameOfPlayer2+" Won the game");
						 }
						 System.exit(0);
				}
					
				else if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Tie between "+nameOfPlayer1+" and "+ nameOfPlayer3);
						tie();
						 if(numFromGuesser==tiedPlayer1) {
							System.out.println(nameOfPlayer1+" Won the game");
						}
						 else {
						System.out.println(nameOfPlayer3+" Won the game");
						 }
						  System.exit(0);
						}
			else {
				 System.out.println(nameOfPlayer1+" won the game");
				}
			}
			
			else if(numFromGuesser==numFromPlayer2) {	
			  if(numFromGuesser==numFromPlayer2&& numFromGuesser==numFromPlayer3) {
				  System.out.println("Tie between "+nameOfPlayer2+" and "+ nameOfPlayer3);
				tie();
				if(numFromGuesser==tiedPlayer1) {
					System.out.println(nameOfPlayer2+" Won the game");
				}
				else {
					System.out.println(nameOfPlayer3+" Won the game");
					}
				System.exit(0);
				}  
		
			  
			  else {
				  System.out.println(nameOfPlayer2+" won the game");
			  }
			
			 }
			 else if(numFromGuesser==numFromPlayer3) {
				System.out.println(nameOfPlayer3+" won the game");
			 }
			 else{
				 System.out.println("All Lost the game");
			 }
			}
	}
	

public class GuesserGame {
	public static void main(String[]args) {
		Umpire d=new Umpire();
		d.guesser();
		d.name();
		d.player();
		d.compare();
	}
}

		
