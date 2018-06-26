
public class Die
{
    // static, or "class" variables
    private static int 
    // instance variables
    private int showing;
    private int numSides;
    
    // constructor: same name as class
    // automatically runs when object is created
    public Die(int sidesToSet)
    {
        numSides = sidesToSet;
        roll();
    }

    public Die()
    {
        numSides = 6;
        roll();
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
