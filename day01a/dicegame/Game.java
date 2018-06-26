
public class Game
{
    public static void main(String[] args)
    {
        Die die1 = new Die();
        die1.roll();
        int value = die1.getShowing();
        System.out.println(value);
    }
}
