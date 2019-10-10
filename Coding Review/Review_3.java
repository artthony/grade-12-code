// Anthony Maocheia-Ricci, September 15th, 2019
// Review Assignment 3

// import packages
import java.util.*;
import java.io.*;

public class Review_3 {
  public static void main ( String[] args ) throws Exception {
    // initializing scanner and variables
    Scanner input = new Scanner( System.in );
    double s = 0, m = 0, h = 0; // seconds, minutes, hours
    
    // asking for time in seconds, saving to variable
    System.out.println("Please input time in seconds.");
    s = input.nextDouble();
    int sec = (int)s;
    
    // converting total seconds to hours
    h = s/3600;
    
    // converting excess hours into minutes
    if(h < 1) { // checking if hours is decimal
      m = h * 60; 
      h = 0;
    }
    else { // if hours isn't a decimal, floor value, turn remainder into minutes, keep floored value as hours
      double hfl = Math.floor(h);
      m = (h - hfl) * 60;
      h = hfl;
    }
    
    // converting excess minutes into seconds
    if(m < 1) { // checking if minutes is decimal
      s = m * 60;
      m = 0;
    }
    else { // if minutes isn't a decimal, floor value, turn reminder into seconds, keep floored value as minutes
      double mfl = Math.floor(m);
      s = (m - mfl) * 60;
      m = mfl;
    }
    
    // print hours, minutes and seconds
    System.out.println(sec + " seconds are: " + (int)h + " hours, " + (int)m + " minutes and " + Math.round(s) + " seconds.");
    
  }
}