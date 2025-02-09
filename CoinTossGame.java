import java.util.Random;

public class CoinTossGame {

    public static void main(String[] args) {
        Random random = new Random();
        int headsCount = 0;
        int tailsCount = 0;

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
