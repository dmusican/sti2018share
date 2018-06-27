import java.util.Scanner;
public class Geometry {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("(c)ircle or (r)ectangle? ");
      String response = input.next();
      Shape s;
      if (response.equals("c")) {
         s = new Circle();
      } else {
         s = new Rectangle();
         Rectangle temp = (Rectangle)s;
         System.out.println(temp.getNumSides());
      }
      System.out.println(s.area());
      System.out.println(s.perimeter());
      System.out.println(s.getName());
   }
}
