package onboarding;

import java.util.List;

class Problem1 {
    private final static int EXCEPTION_NUM = -1;
    private final static int CRONG_WIN = 2;
    private final static int POBI_WIN = 1;
    private final static int DRAW_GAME = 0;
    private final static int FIRST_PAGE = 1;
    private final static int MAX_PAGE = 400;
    private final static int LIST_GET_ZERO=0;
    private final static int LIST_GET_ONE=1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if(!(inputValidate(pobi)&&isBookPage(pobi)&&validateInputSize(pobi))){
            return EXCEPTION_NUM;
        }
        if(!(inputValidate(crong)&&isBookPage(crong)&&validateInputSize(crong))){
            return EXCEPTION_NUM;
        }
        char[] pobi1 = intToChar(pobi.get(LIST_GET_ZERO));
        char[] pobi2 = intToChar(pobi.get(LIST_GET_ONE));
        char[] crong1 = intToChar(crong.get(LIST_GET_ZERO));
        char[] crong2 = intToChar(crong.get(LIST_GET_ONE));
        int maxPobi = compare(compare(sum(pobi1),multi(pobi1)),compare(sum(pobi2),multi(pobi2)));
        int maxCrong = compare(compare(sum(crong1),multi(crong1)),compare(sum(crong2),multi(crong2)));
        return whoWin(maxPobi,maxCrong);
    }
    private static boolean inputValidate(List<Integer> numList){
        if(numList.get(LIST_GET_ZERO)==numList.get(LIST_GET_ONE)-1){
            return true;
        }
        return false;
    }
    private static boolean isBookPage(List<Integer> numList){
        if(numList.get(LIST_GET_ZERO)>=FIRST_PAGE && numList.get(LIST_GET_ONE)<=MAX_PAGE){
            return true;
        }
        return false;
    }
    private static boolean validateInputSize(List<Integer> numList){
        if(numList.size()==2){
            return true;
        }
        return false;
    }
    private static int whoWin(int num1, int num2){
        if(num1>num2){
            return POBI_WIN;
        }else if(num1==num2){
            return DRAW_GAME;
        }return CRONG_WIN;
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
        int Multi = 1;
        for (int i = 0; i<num.length;i++){
            Multi *= Character.getNumericValue(num[i]);
        }
        return Multi;
    }

    private static char[] intToChar(int num){
        return Integer.toString(num).toCharArray();
    }
}