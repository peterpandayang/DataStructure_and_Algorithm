package Poker;
import java.util.Random;
/**
 * Created by bingkunyang on 16/1/6.
 */
public class Test {
    public static void main(String[] args) {
        String[] suits={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] ranks={"Spades","Hearts","Clubs","Diamonds"};
        Random random = new Random();
        int t1=Math.abs(random.nextInt())%13;
        int t2=Math.abs(random.nextInt())%4;
        int id = t1 + t2 * 13 + 1;
        System.out.print("The card you picked is ");
        System.out.print(suits[t1]);
        System.out.print(" of ");
        System.out.print(ranks[t2]);
        System.out.print(" with ID of ");
        System.out.println(id);
    }
}