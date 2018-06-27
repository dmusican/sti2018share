import java.util.Scanner;
public class Geometry {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("(c)ircle or (r)ectangle? ");
      String response = input.next();
      if (response.equals("c")) {
         Circle c = new Circle();
         System.out.println(c.area());
         System.out.println(c.perimeter());
      } else {
         Rectangle r = new Rectangle();
         System.out.println(r.area());
         System.out.println(r.perimeter());
      }
   }
}
