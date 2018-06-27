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
    System.out.println(s.hashCode());
    addText(s);
    System.out.println(s);
  }
}

    