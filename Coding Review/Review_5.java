// Anthony Maocheia-Ricci, September 15th, 2019
// Review Assignment 5

// import packages
import java.util.*;
import java.io.*;

public class Review_5 {
  public static void main ( String[] args ) throws Exception {
    // initialize Scanner
    Scanner input = new Scanner( System.in );
    
    // looping 5 times
    for(int i = 0; i < 5; i++) {
      System.out.println("Input any number/letter/symbol, followed by [enter]."); // asking for value
      System.out.println("The ASCII value of what you pressed is: " + (int)(input.next().charAt(0)) + "\n"); // print and conversion, turning the character inputted into an int
    } // end for
    
  } // end main
} // end class