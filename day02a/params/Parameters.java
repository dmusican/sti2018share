public class Parameters {
  public static void addOne(int x) {
    x = x + 1;
  }
  
  public static void addText(String t) {
    t = t + "a";
  }
  
  public static void main(String[] args) {
    int y = 0;
    addOne(y);
    System.out.println(y);
    
    String s = "hello";
    addText(s);
    System.out.println(s);
    
    Object obj1 = new Object();
    Object obj2 = obj1;
    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
  }
}

    