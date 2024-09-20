import java.lang.Math;

public class Main
{
  public static void main(String[] args)
  {
    distance(0,5,0,0);
    quadraticAdd(1.0, 4.0, 2.0);
    quadraticSub(1.0, 4.0, 2.0);
  }

  // ----- Distance Formula -----
  private static void distance(int x1, int y1, int x2, int y2) {
    double D = Math.sqrt((double)(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    System.out.println(D);
  }

  // ----- Quadratic Formula 1 -----
  private static void quadraticAdd(double a, double b, double c){
    double x = ((-1*b + Math.sqrt(b*b - 4*a*c))/2*a);
    System.out.println(x);
  }

  // ----- Quadratic Formula 2 -----
  private static void quadraticSub(double a, double b, double c){
    double x = ((-1*b - Math.sqrt(b*b - 4*a*c))/2*a);
    System.out.println(x);
  }
}
