
public class Game
{
    public static void main(String[] args)
    {
        Die die1 = new Die();
        die1.roll();
        int value = die1.getShowing();
        Die die2 = new Die();
        
        System.out.println(value);
    }
}
