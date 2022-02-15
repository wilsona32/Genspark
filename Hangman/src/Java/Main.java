import java.util.Scanner;
import java.util.*;

public class Main {
    public static int right = 0;
    public static char guessWord[]={'c','a','r'};
    public static void Hangman(){
        //variable initialization
        int guesses = 5;
        right = 0;
        int randomWordNumber = (int)((Math.random()* guessWord.length ));
        ArrayList<Character> missed = new ArrayList<Character>();
        Scanner input = new Scanner(System.in);
        System.out.println("H A N G M A N");
        System.out.println("The guess word has " + guessWord.length +" letters.");
        print();
        check();
        //calls play again to decide if randomNum will run again or stop running
        playAgain();
        }
    public static void print() {
        int guesses = 5;
        int randomWordNumber = (int)((Math.random()* guessWord.length ));
        ArrayList<Character> missed = new ArrayList<Character>();
        char [] correctLetter = {'_', '_', '_'};
        Scanner input = new Scanner(System.in);
        while(right <3) {
            System.out.println("Missed Letters: " + missed);
            System.out.println("Guess a Letter. ");
            char letter = input.next().charAt(0);//Incrementing letters each time.
            if(letter == guessWord[0]){
                System.out.println("There is 1 "+guessWord[0]+" in the word");
                System.out.println("Good Answer");
                correctLetter[0] = letter;
                System.out.println(correctLetter);
                System.out.println("You have " + guesses + " remaining");
                right++;
            }else if(letter==guessWord[1]){
                System.out.println("There is 1 "+guessWord[1]+" in the word");
                System.out.println("Good Answer");
                correctLetter[1] = letter;
                System.out.println(correctLetter);
                System.out.println("You have " + guesses + " remaining");
                right++;
            }else if(letter ==guessWord[2]) {
                System.out.println("There is 1 "+guessWord[2]+" in the word");
                System.out.println("Good Answer");
                correctLetter[2] = letter;
                System.out.println(correctLetter);
                System.out.println("You have " + guesses + " remaining");
                right++;
            } else {
                System.out.println("The letter you guessed is not in the word.");
                if (missed.contains(letter)){
                    System.out.println("You Tried this letter already, pick again");
                    print();
                }else {
                    missed.add(letter);
                }
                guesses--;
                System.out.println("You have " + guesses + " remaining");
            }
        }
    }
    public static void check() {
        char[] correctLetter = {'c','a','r'};
        if (correctLetter == guessWord) {
            System.out.println("You found the secret word!!");
            System.out.print("It was " );
            System.out.println(correctLetter);
        }
    }
    public static void playAgain(){
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play again? (y or n) ");
        String answer = input.next();
        //determines if the game restarts, otherwise stop the program
        if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
            Hangman();
        }else {
            System.out.print("Thanks for playing! ");
        }
    }
        public static void main (String[]args){
            Hangman();
        }
    }

