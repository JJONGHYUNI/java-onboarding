package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Problem5 {
    private static class DivisionMoney {
        int quotitent;
        int remainder;

        public DivisionMoney(int quotitent, int remainder){
            this.quotitent = quotitent;
            this.remainder = remainder;
        }
    }

    private final static int MAX_LENGTH = 1000000;
    private final static int MIN_LENGTH = 1;

    private final static int[] MONEY_LIST = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < MONEY_LIST.length; i++){
            DivisionMoney divisionMoney = divisionForEachMoney(money, MONEY_LIST[i]);
            answer.add(divisionMoney.quotitent);
            money = divisionMoney.remainder;
        }
        return answer;
    }

    private static boolean validateMoneyRange(int money){
        return money >= MIN_LENGTH && money <= MAX_LENGTH;
    }

    private static DivisionMoney divisionForEachMoney(int currentMoney, int divisionMoney){
        return new DivisionMoney(currentMoney/divisionMoney, currentMoney%divisionMoney);
    }
}
