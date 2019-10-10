// Anthony Maocheia-Ricci, September 23th, 2019
// Review Assignment 8

// import packages
import java.util.*;
import java.io.*;

public class Review_8 {
  public static void main ( String[] args ) throws Exception {
    // initializing scanner
    Scanner input = new Scanner( System.in );
    
    // prompting for integer, taking it into integer
    System.out.println("Please input an Integer to find out all of it's factors:");
    int num = input.nextInt();
    
    // looping for length of the number, not counting 0
    for(int i = 1; i < (num + 1); i++) {
      if(num % i == 0) { // if number has no remainder, print
        System.out.print(i + " ");
      }
    } // end for
    
  } // end main
} // end for