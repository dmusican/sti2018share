
public class Die
{
    // instance variables
    private int showing;
    private int numSides;
    
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
