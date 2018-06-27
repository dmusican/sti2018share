public class Rectangle {
   private double length;
   private double width;
   
   public Rectangle() {
      length = 6;
      width = 5;
   }
   
   public double area() {
      return length * width;
   }
   
   public double perimeter() {
      return 2 * (length + width);
   }
}