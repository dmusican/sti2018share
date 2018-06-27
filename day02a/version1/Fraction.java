public class Fraction {
   private int numerator;
   private int denominator;

   public Fraction multiply(Fraction f1,
                                Fraction f2) {
      int newNumerator = f1.getNumerator() *
                        f2.getNumerator();
   
      int newDenominator = f1.getDenominator() *
                          f2.getDenominator();
     
      return new Fraction(newNumerator,
                          newDenominator);
                                
   }
      
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