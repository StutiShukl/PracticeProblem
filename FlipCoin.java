// program for filp coin

public class FlipCoin {

    public static void main(String[] args) {
        int numberOfFlips = 100; // Number of times to flip the coin

        // Flip the coin and print results
        flipCoin(numberOfFlips);
    }

    public static void flipCoin(int numberOfFlips) {
        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < numberOfFlips; i++) {
            if (Math.random() < 0.5) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        double headsPercentage = (double) headsCount / numberOfFlips * 100;
        double tailsPercentage = (double) tailsCount / numberOfFlips * 100;

        System.out.println("Heads: " + headsPercentage + "%");
        System.out.println("Tails: " + tailsPercentage + "%");
    }
}
