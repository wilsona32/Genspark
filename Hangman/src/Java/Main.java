import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static Charset utf8 = StandardCharsets.UTF_8;
    public static int right = 0;
    public static char guessWord[]={'c','a','r'};
    public static player play = new player();
    public static void Hangman(){
        //variable initialization
        int guesses = 5;

        right = 0;
        int randomWordNumber = (int)((Math.random()* guessWord.length ));
        ArrayList<Character> missed = new ArrayList<Character>();
        Scanner input = new Scanner(System.in);
        System.out.println("H A N G M A N");
        System.out.println("The guess word has " + guessWord.length +" letters.");
        System.out.println("Can we get a name for you, Player?");
        String name = input.nextLine();
        play.setName(name);
        System.out.println("Thank you, now we can get started " + name);
        print();
        check();
        String temp = play.toString();

        try {
            Files.write(Paths.get("HighScore.txt"),Collections.singleton(temp),utf8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                play.setGuesses(String.valueOf(guesses));
            }else if(letter==guessWord[1]){
                System.out.println("There is 1 "+guessWord[1]+" in the word");
                System.out.println("Good Answer");
                correctLetter[1] = letter;
                System.out.println(correctLetter);
                System.out.println("You have " + guesses + " remaining");
                right++;
                play.setGuesses(String.valueOf(guesses));
            }else if(letter ==guessWord[2]) {
                System.out.println("There is 1 "+guessWord[2]+" in the word");
                System.out.println("Good Answer");
                correctLetter[2] = letter;
                System.out.println(correctLetter);
                System.out.println("You have " + guesses + " remaining");
                right++;
                play.setGuesses(String.valueOf(guesses));
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
                play.setGuesses(String.valueOf(guesses));
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

    public static class player {
        private String name;
        private String guesses;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getGuesses() {
            return guesses;
        }
        public void setGuesses(String guesses) {
            this.guesses = guesses;
        }
        public player(){
        }
        @Override
        public String toString(){
            return "Player Name: " + name + ", " + "Remaining guesses: " + guesses ;
        }
    }
    }


