// basics of OOP, inheritance: November 7, 2019
import java.util.*;

public class ChimpClient {
  public static void main( String[] args ) {
    Scanner input = new Scanner( System.in );
    
    Chimp c = new Chimp(); // making the object
    c.eat(); // calling eat method from subclass, takes it from super
    c.sleep(); // calling eat method from subclass, takes it from super
    c.drink(); // calling eat method from subclass, *only in subclass*
    
    Gorilla g = new Gorilla(); // making second obejct
    g.swing();
    
  } // close main
} // close class 