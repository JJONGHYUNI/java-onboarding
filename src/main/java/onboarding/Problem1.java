package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        char[] pobi1 = intToChar(pobi.get(0));
        char[] pobi2 = intToChar(pobi.get(1));
        char[] crong1 = intToChar(crong.get(0));
        char[] crong2 = intToChar(crong.get(1));
        int maxPobi = compare(compare(sum(pobi1),multi(pobi1)),compare(sum(pobi2),multi(pobi2)));
        int maxCrong = compare(compare(sum(crong1),multi(crong1)),compare(sum(crong2),multi(crong2)));
        return answer;
    }
    private static int compare(int num1, int num2){
        if(num1>num2){
            return num1;
        }
        return num2;
    }
    private static int sum(char[] num){
        int Sum = 0;
        for (int i = 0; i<num.length;i++){
            Sum+=Character.getNumericValue(num[i]);
        }
        return Sum;
    }
    private static int multi(char[] num){
        int Multi = 0;
        for (int i = 0; i<num.length;i++){
            Multi = Character.getNumericValue(num[i]);
        }
        return Multi;
    }
    private static char[] intToChar(int num){
        return Integer.toString(num).toCharArray();
    }
}