
public class Die
{
    // instance variable
    private int showing;
    
    public void roll()
    {
        showing = (int)(Math.random()*6+1);
    }
    
    public int getShowing()
    {
        return showing;
    }

}
