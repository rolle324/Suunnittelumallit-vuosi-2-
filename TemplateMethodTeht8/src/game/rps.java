package game;

import java.util.Random;

//rock paper scissors
public class rps extends game {
	private int player1score = 0;
	private int player2score = 0;

	 void initializeGame() {
		 resetScore();
		 
		 
	 };
	 void playRound() {
		 Random randomNum = new Random();
		  int player1choice = 1 + randomNum.nextInt(3);
		  int player2choice = 1 + randomNum.nextInt(3);
		  
		  //1. kivi, 2. paperi, 3. sakset
		  
		  
		  //tarkastetaan vaihtoehdot ja annetaan piste voittajalle
		  if(player1choice == 1 && player2choice == 2) {
			  System.out.println("Player 1 chose rock and Player 2 chose paper");
			  timeBetweenActions();
			  System.out.println("Player 2 wins!");
			  player2score++;
		  }
		  
		  else if(player1choice == 2 && player2choice == 1) {
			  System.out.println("Player 1 chose paper and Player 2 chose rock");
			  timeBetweenActions();
			  System.out.println("Player 1 wins!");
			  player1score++;
		  }
		  
		  else if(player1choice == 3 && player2choice == 2) {
			  System.out.println("Player 1 chose scissors and Player 2 chose paper");
			  timeBetweenActions();
			  System.out.println("Player 1 wins!");
			  player1score++;
		  }
		  
		  else if(player1choice == 2 && player2choice == 3) {
			  System.out.println("Player 1 chose paper and Player 2 chose scissors");
			  timeBetweenActions();
			  System.out.println("Player 2 wins!");
			  player2score++;
		  }
		  
		  else if(player1choice == 1 && player2choice == 3) {
			  System.out.println("Player 1 chose rock and Player 2 chose scissors");
			  timeBetweenActions();
			  System.out.println("Player 1 wins!");
			  player1score++;
		  }
		  
		  else if (player1choice == 3 && player2choice == 1) {
			  System.out.println("Player 1 chose scissors and Player 2 chose rock");
			  timeBetweenActions();
			  System.out.println("Player 2 wins!");
			  player2score++;
		  }
		  
		  
		  //tarkastetaan tasapelit
		  else if (player1choice == 1 && player2choice == 1) {
			  System.out.println("Player 1 chose rock and Player 2 chose rock");
			  timeBetweenActions();
			  System.out.println("Its a tie!");
		  }
		  
		  else if (player1choice == 2 && player2choice == 2) {
			  System.out.println("Player 1 chose paper and Player 2 chose paper");
			  timeBetweenActions();
			  System.out.println("Its a tie!");
		  }
		  
		  else {
			  System.out.println("Player 1 chose scissors and Player 2 chose scissors");
			  timeBetweenActions();
			  System.out.println("Its a tie!");  
			  
		  }
		  
		  
		 
	 };
	boolean endOfGame() {
		//best of 3 games
		if (player1score + player2score == 3 || player1score == 2 || player2score == 2) {
			return true;	
		}
		
		return false;
	};
	void printWinner() {
	if (player1score > player2score) {
		System.out.println("Player 1 is the winner! by: "+player1score+"-"+player2score+" Score");	
	}
	else {
		System.out.println("Player 2 is the winner! by: "+player2score+"-"+player1score+" Score");
	}
	
	;	
	};
	
	void resetScore() {
		player1score = 0;
		player2score = 0;
	}
	
	void timeBetweenActions() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
