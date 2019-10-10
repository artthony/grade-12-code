// Anthony Maocheia-Ricci, September 9th, 2019
// importing packages
import java.util.*;
import java.io.*;

public class AL_S1 {
  public static void main( String[] args) throws Exception {
    // initializing variables
    Scanner input = new Scanner(new File("DATA_ShoppingTrouble.txt")); 
    ArrayList<String> gifts = new ArrayList<String>();
    
    // inputting file into ArrayList
    while(input.hasNext()) {
      gifts.add(input.next());
    } // end while
    
    // running for strings in ArrayList gifts
    for(String s: gifts) {
      
      // getting first and second letters of word
      String first = s.substring(0, 1);
      String se = s.substring(1, 2);
      
      // checking if first letter is a vowel, adding "yay"
      if(first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u") || first.equals("y")) {
        System.out.println(s + "yay");
      }
      // checking if second letter is a vowel, moving first letter, adding "ay"
      else if(se.equals("a") || se.equals("e") || se.equals("i") || se.equals("o") || se.equals("u") || se.equals("y")) {
        System.out.println(s.substring(1) + first + "ay");
      }
      // if neither, it means that the word starts with a consonant cluster, moving first two letters, adding "ay"
      else {
        System.out.println(s.substring(2) + first + se + "ay");
      }
    } // end for
  } // end main
} // end class