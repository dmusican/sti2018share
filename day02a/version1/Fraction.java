public class Fraction {
   private int numerator;
   private int denominator;
   
   public Fraction(int num, int den) {
      numerator = num;
      denominator = den;
   }
   
   public void display() {
      System.out.println(numerator + "/"
                            + denominator);
   }
   
   public int getNumerator() {
      return numerator;
   }
  
   public int getDenominator() {
      return denominator;
   }

}