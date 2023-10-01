package onboarding;

public class Problem4 {
    private static final int UPPER_CHAR_START_POINT = 65;
    private static final int LOWER_CHAR_START_POINT = 97;
    private static final int UPPER_CHAR_END_POINT = 90;
    private static final int LOWER_CHAR_END_POINT = 122;
    public static String solution(String word) {
        String answer = "";
        System.out.println(word.length());
        for(int i = 0; i<word.length(); i++){
            char charTemp = word.charAt(i);
            if (!isAlpabet(charTemp)){
                answer+=charTemp;
                continue;
            }
            int temp = charToCharPoint(charTemp);
            if(!isUpper(charTemp)){
                answer += (char) reverseLowerCharPoint(temp);
                continue;
            }
            answer += (char) reverseUpperCharPoint(temp);
        }
        return answer;
    }

    private static boolean validateLengthRange(int len){
        return len>=1 && len<=1000;
    }
    private static boolean isAlpabet(char c){
        return Character.isAlphabetic(c);
    }
    private static boolean isUpper(char c){
        return Character.isUpperCase(c);
    }
    private static int charToCharPoint(char c){
        return (int)c;
    }

    private static int reverseLowerCharPoint(int c){
        return LOWER_CHAR_END_POINT - (c - LOWER_CHAR_START_POINT);
    }

    private static int reverseUpperCharPoint(int c){
        return UPPER_CHAR_END_POINT - (c - UPPER_CHAR_START_POINT);
    }
}
