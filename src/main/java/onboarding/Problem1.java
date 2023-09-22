package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }
    private static int sum(char[] num){
        int Sum = 0;
        for (int i = 0; i<num.length;i++){
            Sum+=Character.getNumericValue(num[i]);
        }
        return Sum;
    }
    private static char[] intToChar(int num){
        return Integer.toString(num).toCharArray();
    }
}