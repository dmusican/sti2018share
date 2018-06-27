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
    
    Object x = new Object();
    Object y = x;
    System.out.println(x.hashCode());
    System.out.println(y.hashCode());
  }
}

    