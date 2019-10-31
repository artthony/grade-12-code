import java.util.Scanner;
import java.io.File;

public class WordClient {
  public static void main(String[] args) throws Exception{
    Scanner input = new Scanner(new File("DATAWord.txt"));
    
    int i = 0, total = 0;
    String data = "";
    //input
    Word[] w = new Word[5];
    for(int j = 0; j < 5; j++) {
      data = input.next();
      w[j] = new Word(data);
    }
    
    // bubble sort the Array
    boolean pass = true;
    while(pass) {
      pass = false;
      for(i = 0; i < 4; i++) {
        if(w[i].len > w[i + 1].len) {
          Word temp = w[i];
          w[i] = w[i + 1];
          w[i + 1] = temp;
          pass = true;  
        } // end if
      } // end for
    } // end while
    
    //output
    for(i = 0; i < 5; i++) {
      System.out.print(w[i].word + " ");
    } // end for
    
  } // end main
} // end class