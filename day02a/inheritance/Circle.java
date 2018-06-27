public class Circle implements Shape {
   private double radius;
   private String name;
   
   public Circle() {
      radius = 3;
      name = "HappyCircle";
   }
   
   public double area() {
      return Math.PI * Math.pow(radius,2);
   }
   
   public double perimeter() {
      return 2 * Math.PI * radius;
   }
   
   public String getName() {
      return name;
   }
}