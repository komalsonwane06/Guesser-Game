import java.util.*;

class Guesser{
    int guessNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Guesser:-");
        int guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player{
    int playerNum(int playerNumber){
        Scanner scan = new Scanner(System.in);
        System.out.println("palyer"+ playerNumber + ", guess the Number:-");
        int playerNo = scan.nextInt();
        return playerNo;
    }
}

class Umpire{
    
    int NumberFromGuesser;
    int NumberFromPlayer1;
    int NumberFromPlayer2;
    int NumberFromPlayer3;
    
    void takeNumberOfGuesser(){
        Guesser g = new Guesser();
        NumberFromGuesser = g.guessNumber();
    }
    
    void takeNumberOfPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        
        NumberFromPlayer1 = p1.playerNum(1);
        NumberFromPlayer2 = p1.playerNum(2);
        NumberFromPlayer3 = p1.playerNum(3);
    }
    
    void compare(){
        if(NumberFromGuesser == NumberFromPlayer1){
            if(NumberFromGuesser == NumberFromPlayer2 && NumberFromGuesser == NumberFromPlayer3){
                System.out.println("All players guessed correctly! Game tie.");
            }
            else if(NumberFromGuesser == NumberFromPlayer2){
                System.out.println("Player 1 and Player 2 won! And Player 3 loss");
            }
            else if(NumberFromGuesser == NumberFromPlayer3){
                System.out.println("Player 1 and Player 3 won! And Player 2 loss");
            }
            else {
                System.out.println("Player 1 won the game!");
            }
        }
        
        else if(NumberFromGuesser == NumberFromPlayer2){
            if(NumberFromGuesser == NumberFromPlayer3){
                System.out.println("Player 2 and Player 3 won! And Player 1 loss");
            }
            else {
                System.out.println("Player 2 won the game!");
            }
        }
        
        else if(NumberFromGuesser == NumberFromPlayer3){
                System.out.println("Player 3 won the game!");
        }
        
        else{
            System.out.println("Game Over. No one guessed it right!");
        }
    }
}

public class Launch{
    public static void main(String args[]){
        Umpire um = new Umpire();
        um.takeNumberOfGuesser();
        um.takeNumberOfPlayer();
        um.compare();
    }
}
