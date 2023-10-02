package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    private final static int MAX_LENGTH = 1000000;
    private final static int MIN_LENGTH = 1;

    private final static int[] MONEY_LIST = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        return answer;
    }

    private static boolean validateMoneyRange(int money){
        return money >= MIN_LENGTH && money <= MAX_LENGTH;
    }
    
}
