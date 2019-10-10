import java.util.*;
import java.io.*;

public class RequiFract {
  public static void main ( String[] args ) throws Exception {
    // initializing scanner and variables
    Scanner input = new Scanner(new File("DATA_RequiFract.txt"));
    
    for(int i = 0; i < 5; i++) {
      double fi = input.nextDouble(), s = input.nextDouble(), t = input.nextDouble(), fo = input.nextDouble();
      //System.out.println(fi + " " + s + " " + t + " " + fo);
      if(fi/s == t/fo) {
        System.out.println("Requivalent");
      }
      
      else {
        double div = t/fo;
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        
        String fir = Integer.toString(fi(int));
        String sec = Integer.toString(s(int));
        
       
        
        for(int j = 0; j < 2; j++) {
          first.add(Integer.parseInt(fir.substring(j, j + 1)));
          second.add(Integer.parseInt(sec.substring(j, j + 1)));
        }
        
         System.out.println(first + " " + second);
        
        Collections.reverse(first);
        
        if(fi/s == t/fo) {
          System.out.println("Requivalent");
        }
        
        else {
          Collections.reverse(first);
          Collections.reverse(second);
          
          if(fi/s == t/fo) {
            System.out.println("Requivalent");
          }
          
          else {
            Collections.reverse(first);
            
            if(fi/s == t/fo) {
              System.out.println("Requivalent");
            }
            
            else {
              System.out.println("not possible");
            }
          }
        }
        
      }
    }
    
  }
}