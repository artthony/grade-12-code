// Anthony Maocheia-Ricci
// Truncatable Primes Java Code: October 1st, 2019

// importing packages
import java.util.*;
import java.io.*;

public class truncatableprimes {
  public static void main( String[] args ) throws Exception {
    // initializing variables
    int ten = 0, number = 20;
    
    // looping for a counter of 10
    while(ten < 10) {
      
      // casting the number to a string for use of .length()
      String num = Integer.toString(number);
      // initializing counters, local number variable
      int primecounter = 0, numb = number, checkcount = 0;
      
      // looping for length of (original) number
      for(int i = 0; i < num.length(); i++) {
        
        // checking if the number is a single digit prime number
        if(numb == 2 || numb == 3 || numb == 5 || numb == 7) {
          primecounter++; // adding to counter
          continue; // skip all other tests
        }
        
        //checking if the number is a single digit non-prime number
        if(numb == 1 || numb == 4 || numb == 6 || numb == 8 || numb == 9)
          continue; // skip all other tests
        
        // looping for all numbers greater than one, but not the number itself (checking if prime)
        for(int j = 2; j < numb - 1; j++) {
          if(numb % j == 0) // checking if there are any remainders
            continue; // juat continue the loop
          else // otherwise, if there is a remainder 
            checkcount++; // add to a counter
        }
        
        if(checkcount == numb - 3) { // if the prime counter is equal to the number subtracted by 3 (counting for the early start and finish
          primecounter++; // add to main counter
        }
        checkcount = 0; // reset prime checker counter
        
        // removing last digit of number by dividing by 10 and flooring said number to remove decimal
        double numbe = numb/10;
        numb = (int)Math.floor(numbe); // setting local number as new, smaller number
        
      } // end for
      // checking if the main counter is equal to length of the original number
      if(primecounter == num.length()) {
        System.out.println(num); // printing truncatable prime
        ten++; // adding to while loop counter
      }
      number++; // incrementing number
    } // end while
  } // end main
} // end class