/* Dylan G Barnes
Lesson Three Homework: Lottery game
CSC1060X04 Computer Science 1 
Monday, February 5th, 2024.
*/


import java.util.Scanner;
import java.util.Random;

public class lessonthree {
    static final Scanner KEYBOARD = new Scanner(System.in);
    
    static final int ONE_MATCH = 10;
    static final int TWO_MATCH = 100;
    static final int THREE_MATCH_NO = 1000;
    static final int THREE_MATCH_IO = 1000000;
    static final int NO_MATCH = 0;
    
    public static void main(String[] args) {
        System.out.println("Guess the 3 numbers I have chosen.");
        System.out.println("Guess 1 right - $10");
        System.out.println("Guess 2 right - $100");
        System.out.println("Guess 3 right (any order) - $1,000");
        System.out.println("Guess 3 right (exact order) - $1,000,000");
        
        Random random = new Random();
       int comp_guess_one = random.nextInt(10);
       int comp_guess_two = random.nextInt(10);
       int comp_guess_three = random.nextInt(10);

       // Test inits of comp guesses.
       // int comp_guess_one = 1;
       // int comp_guess_two = 2;
       // int comp_guess_three = 3;
        
        System.out.print("Enter the 1st number: ");
        int entryOne = KEYBOARD.nextInt();
        System.out.print("\nEnter the 2nd number: ");
        int entryTwo = KEYBOARD.nextInt();
        System.out.print("\nEnter the 3rd number: ");
        int entryThree = KEYBOARD.nextInt();
        
        System.out.println("Computer picks: " + comp_guess_one + " " + comp_guess_two + " " + comp_guess_three);
        System.out.println("You picked: " + entryOne + " " + entryTwo + " " + entryThree);
        
        boolean isExactMatch = entryOne == comp_guess_one && entryTwo == comp_guess_two && entryThree == comp_guess_three;
        
        int matches = 0;
        int tempGuessOne = comp_guess_one, tempGuessTwo = comp_guess_two, tempGuessThree = comp_guess_three;
        
        if (entryOne == tempGuessOne || entryOne == tempGuessTwo || entryOne == tempGuessThree) {
            matches++;
            if (entryOne == tempGuessOne) tempGuessOne = -1; 
            else if (entryOne == tempGuessTwo) tempGuessTwo = -1;
            else if (entryOne == tempGuessThree) tempGuessThree = -1;
        }
        
        if (entryTwo == tempGuessOne || entryTwo == tempGuessTwo || entryTwo == tempGuessThree) {
            matches++;
            if (entryTwo == tempGuessOne) tempGuessOne = -1; 
            else if (entryTwo == tempGuessTwo) tempGuessTwo = -1;
            else if (entryTwo == tempGuessThree) tempGuessThree = -1;
        }
        
        if (entryThree == tempGuessOne || entryThree == tempGuessTwo || entryThree == tempGuessThree) {
            matches++;
            if (entryThree == tempGuessOne) tempGuessOne = -1; 
            else if (entryThree == tempGuessTwo) tempGuessTwo = -1;
            else if (entryThree == tempGuessThree) tempGuessThree = -1;
        }
        
        if (isExactMatch) {
            System.out.println("Exact Match, you win $" + THREE_MATCH_IO);
        } else if (matches == 3) {
            System.out.println("All 3 Match, but not in order, you win $" + THREE_MATCH_NO);
        } else if (matches == 2) {
            System.out.println("2 Matches, you win $" + TWO_MATCH);
        } else if (matches == 1) {
            System.out.println("1 Match, you win $" + ONE_MATCH);
        } else {
            System.out.println("No Matches, you win $" + NO_MATCH);
        }
    }
}