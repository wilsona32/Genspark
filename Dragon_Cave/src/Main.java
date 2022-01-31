import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int flip = (int) ( Math.random() * 2 + 1);
        int choice;
    System.out.println("You are in a land full of dragons. In front of you,");
    System.out.println("you see two caves. In one cave, the dragon is friendly");
    System.out.println("and will share his treasure with you. The other dragon");
    System.out.println("is greedy and hungry and will eat you on sight.");
    System.out.println("Which cave will you go into? (1 or 2)");
    //reads user input
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
    System.out.println("You approach the cave...");
    System.out.println("It is dark and spooky...");
    System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");

    //if user choice matches randomly decided input, receives good ending, otherwise you get BIT
        if (choice == flip) {
            System.out.println("Reveals the Treasure hidden under it's tongue! Congratulations");
        } else if (choice > 2 | choice < 1) {
            System.out.println("Invalid entry - please enter 1 or 2: ");
            flip = input.nextInt();
        }else{
            System.out.println("Gobbles you down in one bite!");
        }
    }
}
