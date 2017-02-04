/* https://www.codewars.com/kata/55e2adece53b4cdcb900006c/train/java */

public class Tortoise {

    public static void main(String[] args) {

        for (int element : race(720, 850, 70)) {
            System.out.println(element);
        }
    }

    public static int[] race(int v1, int v2, int g) {

        if (v1 > v2) {
            return null;
        }

        double t = ((double) g / (v2 - v1));
        double totalSec = t * 3600;
        double mn = totalSec / 60;
        double s = totalSec - (int) mn * 60;

        //Solve the rounding problems
        int min, sec;
        if ((mn - (int) mn) > 0.999) {
            min = (int) Math.round(mn);
        } else {
            min = (int) Math.floor(mn);
        }

        if ((s - (int) s) > 0.999) {
            sec = (int) Math.round(s);
        } else {
            sec = (int) Math.floor(s);
        }
        if (sec == 60) {
            sec = 0;
        }
        //Wow! I did it!

        int[] resultTime = {(int) t, min, sec};

        return resultTime;// your code
    }
}
