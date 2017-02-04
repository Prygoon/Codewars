/* https://www.codewars.com/kata/world-bits-war/train/java */

public class BitWars {

    public static void main(String[] args) {
        int[] numbers = {7, -3, -2, 6};
        System.out.println(bitsWar(numbers));
    }

    public static String bitsWar(int[] numbers) {
        int oddsBin = 0;
        int evensBin = 0;

        for (int element : numbers) {
            if (element % 2 == 0) {
                if (element > 0) {
                    evensBin += Integer.bitCount(element);
                } else {
                    evensBin -= Integer.bitCount(Math.abs(element));
                }

            } else {
                if (element > 0) {
                    oddsBin += Integer.bitCount(element);
                } else {
                    oddsBin -= Integer.bitCount(Math.abs(element));
                }
            }
        }

        if (oddsBin == evensBin) {
            return "tie";
        } else if (oddsBin < evensBin) {
            return "evens win";
        } else {
            return "odds win";
        }
        // fight!
    }

}