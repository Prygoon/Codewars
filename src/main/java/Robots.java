    /* https://www.codewars.com/kata/we-are-the-robots-d-0-0-b/train/java */

import java.util.regex.*;

import static java.util.regex.Pattern.CASE_INSENSITIVE;


public class Robots {
    public static void main(String[] args) {
        String[] robots = {"d*(0)(0)}b We're functioning e(<0/>0]#m Automatik Roboter0%1 D[(0)(0)]b","And we are d[(0)(0}]b dancing mechanik d[(0)(0)]b c[(0)(0)]b"};
        for (String element : countRobots(robots)) {
            System.out.println(element);
        }
    }

    //My first Regex experience
    public static String[] countRobots(String[] a) {
        Pattern robot = Pattern.compile("[a-zA-Z][|};&#\\[\\]/><()*]{2}0[|};&#\\[\\]/><()*]{2}0[|};&#\\[\\]/><()*]{2}[a-zA-Z]");//code here
        Pattern functioning = Pattern.compile(".*automatik.*", CASE_INSENSITIVE);
        Pattern dancing = Pattern.compile(".*mechanik.*", CASE_INSENSITIVE);

        int dancingRobotCounter = 0;
        int functioningRobotCounter = 0;

        for (String str : a) {

            Matcher robotSearcher = robot.matcher(str);
            Matcher danceSearcher = dancing.matcher(str);
            Matcher functioningSearcher = functioning.matcher(str);

            if (danceSearcher.find()) {
                while (robotSearcher.find()) {
                    dancingRobotCounter++;
                }
            } else if (functioningSearcher.find()) {
                while (robotSearcher.find()) {
                    functioningRobotCounter++;
                }
            }
        }

        String[] result = {functioningRobotCounter + " robots functioning automatik", dancingRobotCounter + " robots dancing mechanik"};

        return result;
    }
}