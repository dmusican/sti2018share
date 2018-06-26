import java.util.Scanner;

/**
 * My Cipher class. Yes!
 */
public class Cipher 
{ 
  public static void main(String[] main)
  {
    // Get user information
    System.out.print("What is the word to be encoded? ");
    Scanner inp = new Scanner(System.in);
    String original = inp.next();
    System.out.print("What is the key? ");
    int key = inp.nextInt();
    
    // Do the encryption
    String result = "";
    for (int i=0; i < original.length(); i++)
    {
      char letter = original.charAt(i);
      char encryptedLetter = (char)((letter - 'a' + key) % 26 + 'a' );
      result = result + encryptedLetter;
    }
    System.out.println("Encrypted text = " + result);
  }
  
}
