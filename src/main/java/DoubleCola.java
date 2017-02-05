/* https://www.codewars.com/kata/double-cola/train/java */

public class DoubleCola {

    public static void main(String[] args) {

        String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        long n = 7230702951L;
        System.out.println(WhoIsNext(names, n));
    }

    public static String WhoIsNext(String[] names, long n) {

        // Your code is here...
        long sum = 0L;
        int namesLength = names.length;
        int e = 0;
        double result;

        while (sum < n) {
            sum += namesLength * Math.pow(2, e);
            e++;
        }
        sum -= namesLength * Math.pow(2, (e - 1));

        n -= sum;
        result = Math.ceil((double) n / Math.pow(2, (e - 1)));

        return names[(int) result - 1];
    }
}