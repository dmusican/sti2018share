
public class Game
{
    public static void main(String[] args)
    {
        Die die1 = new Die();
        die1.roll();
        die1.setNumSides(6);
        System.out.println(die1.getShowing());
        Die die2 = new Die();
        die2.setNumSides(20);
        die2.roll();
        System.out.println(die2.getShowing());
        
    }
}
