public class Rectangle extends Shape {
   private double length;
   private double width;
   
   public Rectangle() {
      length = 6;
      width = 5;
      //name = "ThoughtfulRectangle";
   }
   
   public double area() {
      return length * width;
   }
   
   public double perimeter() {
      return 2 * (length + width);
   }
   
   public int getNumSides() {
      return 4;
   }
   
}