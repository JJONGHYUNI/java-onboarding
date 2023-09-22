package onboarding;

public class Problem2 {
    private final static int MAX_LENGTH = 1000;
    private final static int MIN_LENGTH = 1;

    public static String solution(String cryptogram) {
        String answer = "answer";
        return answer;
    }

    private final static boolean validateInput(String checkStr){
        if(checkStr.length()<1 || checkStr.length()>1000){
            return false;
        }
        return true;
    }
    

}
