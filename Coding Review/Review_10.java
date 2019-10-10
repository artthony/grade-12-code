// Anthony Maocheia-Ricci, September 23th, 2019
// Review Assignment 10

// import packages
import java.util.*;
import java.io.*;

public class Review_10 {
  public static void main ( String[] args ) throws Exception {
    // initializing scanner and array
    Scanner input = new Scanner( System.in );
    int[] numbs = new int[20];
    
    // inputting random numbers from 0 to 99 into array
    for(int i = 0; i < numbs.length; i++) {
      numbs[i] = (int)(Math.random() * 100);
    } // end for
    
    // sorting array in ascending order
    Arrays.sort(numbs);
    
    // looping for length of array
    for(int i = 0; i < numbs.length; i++){
      if(i == 0) // always print first number
        System.out.print(numbs[i] + " ");
      else if(numbs[i] != numbs[i - 1]) // if number is not the same as the one before it, print
        System.out.print(numbs[i] + " ");
      else // if number is same, continue
        continue;
    } // end for
  } // end main
} // end class