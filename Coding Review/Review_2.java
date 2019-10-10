// Anthony Maocheia-Ricci, September 12th, 2019
// Review Assignment 2

// importing packages
import java.util.*;
import java.io.*;

public class Review_2 {
  public static void main( String[] args ) throws Exception {
    
    // initializing scanner
    Scanner input = new Scanner( System.in );
    
    // calculating volume of cylinder
    System.out.println("Input the radius of the cylinder.");
    double r = input.nextDouble(); // radius
    System.out.println("Input the height of the cylinder.");
    double h = input.nextDouble(); // height (cyl)
    System.out.println("The volume of the cylinder is: " + (Math.PI * Math.pow(r, 2) * h) + "\n"); // calculations
    
    // calculating surface area of box
    System.out.println("Input the length of the box.");
    double l = input.nextDouble(); // length
    System.out.println("Input the width of the box.");
    double w = input.nextDouble(); // width
    System.out.println("Input the height of the box.");
    h = input.nextDouble(); // height
    System.out.println("The surface area of the box is: " + 2 * (w * l + h * l + h * w)); // calculations
  }
}