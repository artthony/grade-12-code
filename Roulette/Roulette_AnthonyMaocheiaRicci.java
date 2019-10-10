// Anthony Maocheia-Ricci, September 12th, 2019
// Array Roulette Assignment (Emilia's)

// importing packages
import java.util.*;
import java.io.*;

public class Roulette_AnthonyMaocheiaRicci {
  public static void main( String[] args) throws Exception {
    // initializing variables
    Scanner input = new Scanner(System.in); 
    boolean test = true, win = false, overload = false;
    String colour = "";
    int bet = 0;
    
    // initializing and storing arrays of red or black numbers
    int[] red = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    int[] black = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
    
    // choosing red or black numbers, while loop to make sure only "r" or "b" are inputted
    while(test){
      System.out.println("Would you like to bet on Red (\"R\") or Black (\"B\")?");
      colour = input.next();
      // checking for red
      if(colour.equalsIgnoreCase("R")){
        colour = "r";
        System.out.println("You chose the red numbers.");
        test = false;
      }
      // checking for black
      else if(colour.equalsIgnoreCase("B")){
        colour = "b";
        System.out.println("You chose the black numbers.");
        test = false;
      }
      // if a proper character was not inputted, print this and try again
      else {
        System.out.println("Please enter a proper letter.");
      }
    } // end while "test"
    
    // choosing how much to bet, if bet is over 10 000, boolean overload is true, and a different outcome is reached
      System.out.println("How much would you like to bet? (You cannot win more than $10 000)");
      bet = input.nextInt();
      if(bet > 10000) {
        System.out.println("You have bet: $" + bet + ".");
        overload = true; // true if bet is greater than $10 000
      }
      else {
        System.out.println("You have bet: $" + bet + ".");
      }
    
    // getting random number between 1 and 37 (where the ball landed on)
    int num = (int)((Math.random()*36) + 1);
    
    // checking if number ball landed on is in the red integer array
    if(colour.equals("r")){
      for(int i: red){ // enhanced for loop because why not
        if(i == num){
          win = true;
        }
      }
    }
    
    // checking if number ball landed on is in the black integer array
    if(colour.equals("b")){
      for(int i: black){ // enhanced for loop once again, same reasoning
        if(i == num){
          win = true;
        }
      }
    }
    
    // calculations and print statements
    // winning while betting under $10 000
    if(win && !overload){
      System.out.println("Congratulations! The ball landed on " + num + " and you have won $" + (bet * 2) + " dollars!");
    }
    // winning while betting over $10 000 (overload is true)
    else if(win && overload){
      System.out.println("Congratulations! The ball landed on " + num + " and you have won $" + (bet + 10000) + " dollars!");
    }
    // losing
    else {
      System.out.println("Better luck next time! The ball landed on " + num + " and you have lost $" + (bet) + " dollars!");
    }
    
  } // end main
} // end class