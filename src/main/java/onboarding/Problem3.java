package onboarding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Problem3 {
    private final static int CONSTANT_TEN = 10;
    private final static int MIN_LENGTH = 1;
    private final static int MAX_LENGTH = 10000;
    public static int solution(int number) {
        if(!validateNumberRange(number)){
            throw new IllegalArgumentException("유효한 숫자를 입력해주세요.");
        }
        int answer = 0;
        for (int i = 1; i<=number; i++){
            answer+=eachDigitsClapping(i);
        }
        return answer;
    }
    private static boolean validateNumberRange(int number){
        return number>=MIN_LENGTH && number<=MAX_LENGTH;
    }

    private static int eachDigitsClapping(int num){
        int count = 0;
        while(num/CONSTANT_TEN !=0){
            if (checkThreeSixNine(num%CONSTANT_TEN)) count++;
            num/=10;
        }
        if(checkThreeSixNine(num%CONSTANT_TEN))count++;
        return count;
    }

    private static boolean checkThreeSixNine(int num){
        if(num == 3 || num == 6 || num == 9){
            return true;
        }return false;
    }
}


