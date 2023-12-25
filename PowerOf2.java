// program for power of 2
public class PowerOf2 {

    public static void main(String[] args) {
        int power = 5; // Power value

        // Calculate and print powers of 2
        powerOf2(power);
    }

    public static void powerOf2(int power) {
        for (int i = 0; i <= power; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}

