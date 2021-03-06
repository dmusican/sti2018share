
public class Die
{
    // static, or "class" variables
    private static int numDice = 0;
    
    // instance variables
    private int showing;
    private int numSides;
    
    // constructor: same name as class
    // automatically runs when object is created
    public Die(int sidesToSet)
    {
        numSides = sidesToSet;
        roll();
        numDice = numDice + 1;
    }

    public Die()
    {
        numSides = 6;
        roll();
        numDice = numDice + 1;
    }
    
    public static int getNumDice()
    {
        return numDice;
    }

    public void roll()
    {
        showing = (int)(Math.random()*numSides+1);
    }
    
    public int getShowing()
    {
        return showing;
    }
    
    public void setNumSides(int sidesToSet)
    {
        numSides = sidesToSet;
    }

    /*public void setNumSides(int numSides)
    {
        this.numSides = numSides;
    }*/
    
}
