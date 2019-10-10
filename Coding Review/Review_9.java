// Anthony Maocheia-Ricci, September 23th, 2019
// Review Assignment 9

// import packages
import java.util.*;
import java.io.*;

public class Review_9 {
  public static void main ( String[] args ) throws Exception {
    // initializing scanner and variables
    Scanner input = new Scanner( System.in );
    int numb = 0;
    
    // prompting for integer, saving as string
    System.out.println("Please input a large Integer.");
    String num = input.next();
    
    // displaying length of number
    System.out.println("The number of digits in the number is: " + num.length());
    
    // adding each substring as int to a number
    for(int i = 0; i < num.length(); i++) {
      numb += Integer.parseInt((num.substring(i, i + 1)));
    }
    
    // displaying sum of digits
    System.out.println("The sum of all the digits is: " + numb);
    
  }
}