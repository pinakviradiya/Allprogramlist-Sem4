import java.util.*;
public class RandomNumber
{
    public static void main(String[] args)
 {
   
        double randomNumber = Math.random();
        int minRange = 0;
        int maxRange = 100;
        int scaledRandomNumber = (int) (minRange + (randomNumber * (maxRange - minRange)));

        System.out.println("Random Number: " + scaledRandomNumber);
    }
}
