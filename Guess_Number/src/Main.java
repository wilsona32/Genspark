import java.util.Scanner;
public class Main {
    //running the game
    public static void randomNum(){
        //variable initialization
        String name;
        int min = 1;
        int max = 20;
        int number = 0;
        int guesses = 0;
        Scanner input = new Scanner(System.in);
        int secret = (int) (Math.random()*(max-min)) + min;

        //beginning prompt to print input name
        System.out.println("Hello! What is your name?");
        name = input.nextLine();
        System.out.println("well, " + name +  ", I am thinking of a number between 1 and 20.");

        //keep guessing till you guess it RIGHT
        while(number!=secret) {
            System.out.println("Take a guess.");
            input = new Scanner(System.in);
            number = input.nextInt();
            if(number > secret) {
                System.out.println("Your guess is too high.");
            } else if (number < secret) {
                System.out.println("Your guess is too low.");
            }
            guesses++;
        }

        //different prompts for guessing on first try, or after multiple attempts
        if(guesses == 1) {
            System.out.println("Good Job, " + name + "! You guessed my number on the 1st try!");
        } else {
            System.out.println("Good Job, " + name + "! You guessed my number in "+ guesses + " guesses!");
        }
        //calls play again to decide if randomNum will run again or stop running
        playAgain();
    }

    //running the prompt to restart the game if the player inputs "Yes" condition
    public static void playAgain(){
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play again? (y or n) ");
        String answer = input.next();
        //determines if the game restarts, otherwise stop the program
        if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
            randomNum();
        }else {
            System.out.print("Thanks for playing! ");
        }
    }


    public static void main(String[] args) {
       randomNum();
    }


}

