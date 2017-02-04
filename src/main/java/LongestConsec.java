/* https://www.codewars.com/kata/consecutive-strings/train/java */

class LongestConsec {

    public static void main(String[] args) {
        String[] stringArray = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abiga.........il"};
        int k = 4;
        System.out.println(longestConsec(stringArray, k));
    }

    public static String longestConsec(String[] strarr, int k) {

        int arrLength = strarr.length;
        String tmp = "";
        String result = "";
        int max = 0;

        if ((arrLength == 0) || (k > arrLength) || (arrLength <= 0)) {
            return "";
        }

        for (int i = 0; i < (arrLength - k+1); i++) {
            for (int j = 0; j < k; j++) {
                tmp += strarr[i + j];
            }
            if (tmp.length() > max) {
                max = tmp.length();
                result = tmp;
            }
            tmp = "";
        }
        return result;// your code
    }
}
