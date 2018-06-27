public class Parameters {
  public static void addOne(int x) {
    x = x + 1;
  }
  
  public static void addText(String t) {
    t = t + "a";
  }
  
  public static void addToFirst(int[] theArray) {
    theArray[0] = theArray[0] + 1;
  }

  public static void otherAddToFirst(int[] theArray) {
    theArray = new int[3];
    theArray[0] = 7;
  }

  public static void main(String[] args) {

    int[] anArray = {5,3,7};
    addToFirst(anArray);
    System.out.println(anArray[0]);

    int[] myArray = {5,3,7};
    otherAddToFirst(myArray);
    System.out.println(myArray[0]);

    
    
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
    
    System.out.println("-------------");
    int xx = 0;
    int yy = xx;
    xx = xx + 1;
    System.out.println(yy);
    
    int[] nums = {7,2,3};
    int[] others = nums;
    nums[0] = 12;
    System.out.println(others[0]);
    
  }
}

    