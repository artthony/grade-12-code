// Anthony Maocheia-Ricci, September 18th, 2019
// Missing Vowel Assignment

// importing packages
import java.util.*;
import java.io.*;

public class MissingVowel_AnthonyMR {
  public static void main( String[] args ) throws Exception {
    
    // initializing scanner & variables
    Scanner input = new Scanner( System.in );
    String word = input.next(), word1 = word;
    int len = word.length();
    ArrayList<Character> rev = new ArrayList<Character>();
    
    // reducing length of word
    wordsnipping: for(int i = 0; i < len; i++) {
      if(word.length() > 1){ // checking if the length of the word is greater than one, cut down word if it is
        if(Character.toString(word.charAt(0)).equals("a") || Character.toString(word.charAt(0)).equals("e") || Character.toString(word.charAt(0)).equals("i") || Character.toString(word.charAt(0)).equals("o") || Character.toString(word.charAt(0)).equals("u") || Character.toString(word.charAt(0)).equals("y")){
          word = word.substring(1);
          continue; // continue if vowel
        }
        else {
          System.out.println(word); // printing if not vowel
          word = word.substring(1);
        }
      }
      else { // if the word is one letter, don't cut down the word
        if(Character.toString(word.charAt(0)).equals("a") || Character.toString(word.charAt(0)).equals("e") || Character.toString(word.charAt(0)).equals("i") || Character.toString(word.charAt(0)).equals("o") || Character.toString(word.charAt(0)).equals("u") || Character.toString(word.charAt(0)).equals("y")){
          continue; // continue if vowel
        }
        System.out.println(word); // printing if not vowel
      }
    }
    
    // reversing word
    wordreversing: for(int i = 0; i < word1.length(); i++) {
      rev.add(word1.charAt(i)); // inputting into char arraylist
    }
    
    // reversing arraylist
    Collections.reverse(rev);
    
    // printing reversed arraylist
    wordreverseprint: for(char c: rev) {
      System.out.print(c);
    }
    
    System.out.println("");

  } // end main
} // end class