//object for Circle1Client
public class Circle1 {
  double r = 1;
  
  public Circle1(double r){ // constructor with an argument
    this.r = r;
  }
  public void calcArea() { // no param, as we are inputting into const.
    double a = Math.PI * r * r;
    System.out.printf("The area is %.3f", a);   
  }
  public void calcCirc() {
    double b = 2 * Math.PI * r;
    System.out.printf("The circumference is %.3f", b);
  }
} // close object class 
