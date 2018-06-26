
public class Die
{
    // instance variables
    private int showing;
    private int numSides;
    
    public void roll()
    {
        showing = (int)(Math.random()*6+1);
    }
    
    public int getShowing()
    {
        return showing;
    }
    
    public void setNumSides(int sidesToSEt

}
