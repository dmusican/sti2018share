import java.util.Scanner;
public class Geometry {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("(c)ircle or (r)ectangle? ");
      String response = input.next();
      if (response.equals("c")) {
         Circle s = new Circle();
      } else {
         Rectangle s = new Rectangle();
      }
      System.out.println(s.area());
      System.out.println(s.perimeter());
   }
}
