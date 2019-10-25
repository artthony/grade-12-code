// basics of OOP, Oct. 25th, 2019
import java.util.*;

public class Circle1Client {
  public static void main( String[] args ) {
    Scanner input = new Scanner( System.in );
    
    System.out.print("Input radius of circle: ");
    double radius = input.nextDouble(); 
    
    Circle1 c1 = new Circle1(radius); // making the object
    c1.calcArea(); // calling area method from object
    System.out.println("");
    c1.calcCirc(); // calling circ method from object
  } // close main
} // close class 