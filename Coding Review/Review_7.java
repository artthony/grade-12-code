// Anthony Maocheia-Ricci, September 16th, 2019
// Review Assignment 7

// import packages
import java.util.*;
import java.io.*;

public class Review_7 {
  public static void main ( String[] args ) throws Exception {
   // initializing scanners & variables
    Scanner input = new Scanner( System.in );
    int count = 0;
    
    // looping 3 times
    for(int three = 0; three < 3; three++){
      // prompting for number input
      System.out.println("Input a number:");
      int num = input.nextInt();
      
      // changing to binary
      String binary = Integer.toBinaryString(num);
      
      // looping for length of number
      for(int i = 0; i < binary.length(); i++) {
        if(binary.substring(i, i + 1).equals("1")){ // looking for 1's, incrementing counter
          count++;
        }
      } // end for
      
      // printing the counter
      System.out.println("There are " + count + " 1's in the binary number.");
      
      count = 0; // resetting count
    } // end for
  } // end main
} // end class