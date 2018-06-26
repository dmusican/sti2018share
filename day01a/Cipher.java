import java.util.Scanner;

/**
 * My Cipher class. Yes!
 */
public class Cipher {
  
  public static void main(String[] main)
  {
    System.out.print("What is the word to be encoded? ");
    Scanner inp = new Scanner(System.in);
    String original = inp.next();
    System.out.print("What is the key? ");
    int key = inp.nextInt();
    // test
    System.out.println(original);
    System.out.println(key);
    
  }
  
}
