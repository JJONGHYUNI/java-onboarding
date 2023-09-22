package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    private final static int CONSTANT_TEN = 10;
    public static int solution(int number) {
        int answer = 0;
        List<Integer> digitList = howDigit(number);
        System.out.print(digitList.toString());
        return answer;
    }
    private final static boolean validateNumberRange(int number){
        if(number<1 || number >10000){
            return true;
        }
        return false;
    }
    private final static List<Integer> howDigit(int number){
        List<Integer> digitList = new ArrayList<>();
        while(number/CONSTANT_TEN!=0){
            digitList.add(number%CONSTANT_TEN);
            number=number/CONSTANT_TEN;
        }
        digitList.add(number%CONSTANT_TEN);
        return digitList;
    }
}
