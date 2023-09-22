package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    private final static int MAX_LENGTH = 1000;
    private final static int MIN_LENGTH = 1;
    private final static String CHECK_LOWER_CASE = "[a-z]+";
    private final static String NOT_VALIDATE = "유효하지 않은 입력 값";
    public static String solution(String cryptogram) {
        if(validateInput(cryptogram) || validateLower(cryptogram)){
            return NOT_VALIDATE;
        }
        String answer = cryptogram;
        while (true){

            String temp = isDuplicateLetter(answer);
            if(temp.length()==answer.length()){
                break;
            }
            answer = temp;
        }
        return answer;
    }

    private final static boolean validateInput(String checkStr){
        if(checkStr.length()<MIN_LENGTH || checkStr.length()>MAX_LENGTH){
            return true;
        }
        return false;
    }

    private final static boolean validateLower(String checkStr){
        if(!checkStr.matches(CHECK_LOWER_CASE)){
            return true;
        }
        return false;
    }

    private final static String isDuplicateLetter(String checkStr){
        String answer="";
        for(int i = 0; i<checkStr.length();i++){
            char checkChar = checkStr.charAt(i);
            if(checkChar!=frontIdx(i,checkStr)&&checkChar!=backIdx(i,checkStr)){
                answer+=checkChar;
            }
        }
        return answer;
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
