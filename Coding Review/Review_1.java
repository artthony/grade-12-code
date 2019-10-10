// Anthony Maocheia-Ricci, September 15th, 2019
// Review Assignment 1

// import packages
import java.util.*;
import java.io.*;

public class Review_1 {
  public static void main ( String[] args ) throws Exception {
    // initializing scanner and variables
    Scanner input = new Scanner(new File("DATA_Review1.txt"));
    double sum = 0, count = 0, check = 0;
    
    // run until a negative number occurs
    do {
      check = input.nextInt(); 
      
      // checking for negative number (you need this for the code to function)
      if(check >= 0){
        sum += (double)check;
        count++; // find total amount of numbers for avg
      }
    } while(check >= 0); // end while

    // calculate and print average
    System.out.println("The average of the integers is: " + (sum/count));
    
  } // end main
} // end class