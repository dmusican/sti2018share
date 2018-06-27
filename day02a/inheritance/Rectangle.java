public class Rectangle implements Shape {
   private double length;
   private double width;
   private String name;
   
   public Rectangle() {
      length = 6;
      width = 5;
      name = "ThoughtfulRectangle";
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