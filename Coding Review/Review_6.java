// Anthony Maocheia-Ricci, September 9th 2019
// importing packages
import java.util.*;
import java.io.*;

public class Review_6 {
  public static void main( String[] args) throws Exception {
    // initializing variables
    Scanner input = new Scanner(System.in);
    boolean check = true;
    
    // looping until boolean is set to false
    while(check){
      // getting password
      System.out.println("Please, enter a password.");
      String pass = input.next();
      
      // password too small, continue loop
      if(pass.length() < 8){
        System.out.println("Password too short. Please try again!");
        pass = "";
      }
      // password just fine, break loop
      else {
        System.out.println(pass + " is a great password!");
        check = false;
      }
    } // end while
  } // end main
} // end class