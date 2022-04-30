//Project Guess the number
import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
//    noOfGuesses is used to count that in how many guesses user got the right number.
    int noOfGuesses = 1;
    int inputNumber;
    Game(){
        // initialize random number in constructor so it always generate a new number.
        Random rand = new Random();
        number = rand.nextInt(100);
    }

    //  Now User starts Guessing the number and the noOfGuesses starts counting till condition  becomes true and In how many guesses user got the right answer.
    void startGame(){
        Scanner sc = new Scanner(System.in);
        do{
            this.inputNumber = sc.nextInt();
            checkNo();
        }while(inputNumber != number);
    }

    //
    void checkNo(){
        if (number == inputNumber) {
            System.out.println("You guessed it in [" +  noOfGuesses + "]  attempts.");
        }
        if (number > inputNumber) {
            System.out.println("Higher Number Please.");
        }
        if (number < inputNumber) {
            System.out.println("Lower Number Please.");
        }
        noOfGuesses++;
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        int inputNumber;
        System.out.println("Guess the Number between 1 - 100 Ex:-10");
        Game player1 = new Game();
        player1.startGame();
    }
}