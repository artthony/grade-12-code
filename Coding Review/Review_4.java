// Anthony Maocheia-Ricci, September 10th 2019
// Review Assignment 4

// importing packages
import java.util.*;
import java.io.*;

public class Review_4 {
  public static void main( String[] args ) throws Exception {
    // initalizing scanner
    Scanner input = new Scanner(System.in);
    
    // asking for first set of coordinates
    System.out.println("Please input the first set of coordinates: (x1, then y1)");
    int x1 = input.nextInt();
    int y1 = input.nextInt();
    
    // asking for next set of coordinates
    System.out.println("Please input the next set of coordinates: (x2, then y2)");
    int x2 = input.nextInt();
    int y2 = input.nextInt();
    
    // calculating slope
    double slope = ((double)y2 - (double)y1)/((double)x2 - (double)x1);
    
    // print statement
    System.out.println("The slope of the line between the points is: " + slope);
  }
}
