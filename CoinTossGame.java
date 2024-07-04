import java.util.Random;
import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {
        Random random = new Random();
        int headsCount = 0;
        int tailsCount = 0;
        System.out.println("Who are you?");
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Tossing a coin...");

        for (int round = 1; round <= 3; round++) {
            boolean isHeads = random.nextBoolean();
            if (isHeads) {
                System.out.println("Round " + round + ": Heads");
                headsCount++;
            } else {
                System.out.println("Round " + round + ": Tails");
                tailsCount++;
            }
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
    }
}
