
public class Game
{
    public static void main(String[] args)
    {
        Die die1 = new Die(12);
        die1.roll();
        System.out.println(die1.getShowing());
        Die die2 = new Die(6);
        die2.setNumSides(20);
        die2.roll();
        System.out.println(die2.getShowing());
        
    }
}
