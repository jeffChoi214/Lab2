import java.util.Scanner;

/*
 * Created by Jeff Choi on 1/31/17.
*/

public class main {
    public static void analyzeNum(int userGuess) {
        System.out.println("Input: " + userGuess);

        if (userGuess % 2 == 0) {
            if (userGuess >= 2 && userGuess <= 25) {
                System.out.println("Even and less than 25");
            }
            else if (userGuess >= 60) {
                System.out.println("" + userGuess + " and Even");
            }
            else {
                System.out.println("Even");
            }
        }
        else {
            System.out.println("" + userGuess + " and Odd");
        }    
    }

    public static void loopThrough(String userName, Scanner sc) {
        char tryAgain;
        int userGuess;

        while (true) {
            System.out.println("Okay " + userName + ", please enter a number between 1 and 100");
            
            while (!sc.hasNextInt()) {
                System.out.println("Please enter an integer!");
                sc.next();
            }

            userGuess = sc.nextInt();

            while (userGuess < 1) {
                System.out.println("Please enter a number that is greater than 0");
                userGuess = sc.nextInt();
            }

            while (userGuess > 100) {
                System.out.println("Please enter a number that is less than or equal to 100");
                userGuess = sc.nextInt();
            }
            
            analyzeNum(userGuess);
                    
            System.out.println("Try again? (y/n)");
            tryAgain = sc.next().charAt(0);

            while (tryAgain != 'n' && tryAgain != 'N' && tryAgain != 'y' && tryAgain != 'Y') {
                System.out.println("Please enter y/n");
                tryAgain = sc.next().charAt(0);
            }

            if (tryAgain == 'n' || tryAgain == 'N') {
                System.out.println("Thank you for your time " + userName + ".");
                break;
            }
            else if (tryAgain == 'y' || tryAgain == 'Y') {
                // not necessary here 
            }
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName;
        char tryAgain;
        int userGuess;

        System.out.println("Welcome, what is your name?");
        userName = sc.next();
        loopThrough(userName, sc);
    }
}
