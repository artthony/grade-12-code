//object for Circle2Client
public class Circle2 {
  private double r = 1; // private variable
  
  public Circle2(double r){ // constructor with an argument
    this.r = r;
  }
  public double calcArea() { // no param, as we are inputting into const.
    return (Math.PI * r * r);  
  }
  public double calcCirc() {
    return (2 * Math.PI * r);
  }
  public double getR() {
    return r; // returning r, is private
  }
  
} // close object class 
