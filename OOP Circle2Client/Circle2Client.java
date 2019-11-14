// encapsulation, Nov 4, 2019
import java.util.*;

public class Circle2Client {
  public static void main( String[] args ) {
    Scanner input = new Scanner( System.in );
    
    System.out.print("Input radius of circle: ");
    double radius = input.nextDouble(); 
    
    Circle2 c2 = new Circle2(radius); // making the object
    System.out.println(c2.getR()); // printing getR() method to print private variable
    
    System.out.printf("The area is %.3f", c2.calcArea());  // calling area method from object
    System.out.println("");
    System.out.printf("The circumference is %.3f", c2.calcCirc()); // calling circ method from object
  } // close main
} // close class 