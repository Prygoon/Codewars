public class MorseCodeDecoder {
    public static void main(String[] args) {
        String s = "   .";
        System.out.println(decode(s));
    }

    public static String decode(String morseCode) {

        morseCode = morseCode.trim();
        char[] chMorseCode = morseCode.toCharArray();
        int n = chMorseCode.length;
        String temp = "";
        String results = "";

        for (int i = 0; i < n; i++) {
            if (chMorseCode[i] != ' ') {
                temp += chMorseCode[i];
            } else if (chMorseCode[i + 1] == ' ') {
                results += temp + " ";
                temp = "";
                i += 2;
            } else {
                results += temp;
                temp = "";
            }
        }
        results += temp;


        return results; // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
    }
}