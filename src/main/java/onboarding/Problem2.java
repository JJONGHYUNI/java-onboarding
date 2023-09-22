package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    private final static int MAX_LENGTH = 1000;
    private final static int MIN_LENGTH = 1;
    private final static String CHECK_LOWER_CASE = "[a-z]+";
    public static String solution(String cryptogram) {
        String answer = cryptogram;
        while (true){
            int idx = isDuplicateLetter(answer);
            if(idx==-1){
                break;
            }
            answer = deleteDuplicateLetter(answer,idx);
        }
        return answer;
    }

    private final static boolean validateInput(String checkStr){
        if(checkStr.length()<MIN_LENGTH || checkStr.length()>MAX_LENGTH){
            return false;
        }
        return true;
    }

    private final static boolean validateLower(String checkStr){
        if(checkStr.matches(CHECK_LOWER_CASE)){
            return true;
        }
        return false;
    }

    private final static int isDuplicateLetter(String checkStr){

    }
    private final static char frontIdx(int idx,String checkStr){
        if(idx==0){
            return ' ';
        }
        return checkStr.charAt(idx-1);
    }
    private final static char backIdx(int idx,String checkStr){
        if(idx==checkStr.length()-1){
            return ' ';
        }
        return checkStr.charAt(idx+1);
    }

    private final static String deleteDuplicateLetter(String checkStr, int idx){
        return checkStr.substring(0,idx)+checkStr.substring(0,idx+2);
    }
}
