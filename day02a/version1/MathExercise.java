public class MathExercise { 

                                
   public static void main(String[] args) {
      Fraction frac1 = new Fraction(3,5);
      Fraction frac2 = new Fraction(4,7);
      frac1.display();
      Fraction answer = 
           frac1.multiply(frac2);
      answer.display();
      System.out.println(Math.PI);
   }
}
