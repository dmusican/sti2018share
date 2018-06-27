public class MathExercise { 

   public static Fraction multiply(Fraction f1,
                                Fraction f2) {
      int newNumerator = f1.getNumerator() *
                        f2.getNumerator();
   
      int newDenominator = f1.getDenominator() *
                          f2.getDenominator();
     
      return new Fraction(newNumerator,
                          newDenominator);
                                
   }
                                
   public static void main(String[] args) {
      Fraction frac1 = new Fraction(3,5);
      Fraction frac2 = new Fraction(4,7);
      frac1.display();
      Fraction answer = multiply(frac1, frac2);
      answer.display();
   }
}
