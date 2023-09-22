package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }
    private static int sum(int num){
        String strNum = Integer.toString(num);
        int Sum = 0;
        for (int i = 0; i<strNum.length();i++){
            Sum+=Character.getNumericValue(strNum.charAt(i));
        }
        return Sum;
    }
}