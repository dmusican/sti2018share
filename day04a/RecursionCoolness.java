public class RecursionCoolness {
  public static int fact(int n) {
    if (n == 1) {
      return 1;
    } else {
      System.out.print(n + "*");
      return n * fact(n-1);
    }
  }
  
  public static String reverse(String s) {
    if (s.length() == 1) {
      return s;
    } else {
      return reverse(s.substring(1)) + s.substring(0,1);
    }
  }
  
  public static int findMax(int[] arr, int start) {
    if (start == arr.length-1) {
      return arr[start];
    } else {
      int maxRest = findMax(arr, start + 1);
      if (arr[start] > maxRest) {
        return arr[start];
      } else {
        return maxRest;
      }
    }
  
  public static void main(String[] args) {
    System.out.println(fact(5));
    System.out.println(reverse("friend"));
    int[] mynums = {5,2,5,1,10,3};
    System.out.println(findMax(mynums,0));
  }
}
