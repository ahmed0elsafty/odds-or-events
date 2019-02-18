import java.util.Scanner;
import java.util.Random;

public class OddsAndEvens {
    public static void main(String[] args) {
        String odd = "o", even = "e";
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String oddOrEven = input.next();
        if (oddOrEven.equalsIgnoreCase("o")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (oddOrEven.equalsIgnoreCase("e")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("---------------------------------------------");
        System.out.print("How many “fingers” do you put out? ");
        int numOfFingers = input.nextInt();
        if (oddOrEven.equalsIgnoreCase("o")) {
            while (numOfFingers % 2 == 0) {
                System.out.println("Invalid value");
                System.out.print("How many “fingers” do you put out? ");
                numOfFingers = input.nextInt();
            }
        } else {
            while (numOfFingers % 2 == 1) {
                System.out.println("Invalid value");
                System.out.print("How many “fingers” do you put out? ");
                numOfFingers = input.nextInt();
            }
        }

        Random random = new Random();
        int computer = random.nextInt(6);
        System.out.println("The computer plays " + computer + " fingers.");
        System.out.println("---------------------------------------------");
        System.out.println(numOfFingers + " + " + computer + " = " + (numOfFingers + computer));
        if ((numOfFingers + computer) % 2 == 0 && oddOrEven.equalsIgnoreCase(even)) {
            System.out.println((numOfFingers + computer) + " is ..... even!");
            System.out.println("That means " + name + " wins");
        } else if ((numOfFingers + computer) % 2 == 1 && oddOrEven.equalsIgnoreCase(odd)) {
            System.out.println((numOfFingers + computer) + " is ..... odd!");
            System.out.println("That means " + name + " wins");
        } else if ((numOfFingers + computer) % 2 == 1) {
            System.out.println((numOfFingers + computer) + " is ..... odd!");
            System.out.println("That means computer wins");
        } else if ((numOfFingers + computer) % 2 == 0) {
            System.out.println((numOfFingers + computer) + " is ..... even!");
            System.out.println("That means computer wins");
        }

    }
}
