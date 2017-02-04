/* https://www.codewars.com/kata/find-the-missing-letter/train/java */

public class MissingLetter {
    public static char findMissingLetter(char[] array) {
        int arrayLength = array.length;
        int missingLetterAscii = 0;

        for (int i = 0; i < (arrayLength - 1); i++) {
            if ((int) array[i + 1] - (int) array[i] != 1) {
                missingLetterAscii = (int) array[i] + 1;
            }
        }


        return (char) missingLetterAscii;
    }
}