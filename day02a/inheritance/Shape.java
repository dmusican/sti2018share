public abstract class Shape {
   protected String name;

   public abstract double area();
   public abstract double perimeter();
   
   public Shape() {
      name = "My empty name who am I?";
   }
   
   public String getName() {
      return name;
   }

}