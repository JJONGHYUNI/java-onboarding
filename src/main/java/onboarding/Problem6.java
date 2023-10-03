package onboarding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {
    private final static String CHECK_DOMAIN = "email.com";
    private static HashMap<String, List<Member>> twoLetterList = new HashMap<>();
    private static HashSet<String> duplicateEmailList = new HashSet<>();
    public static List<String> solution(List<List<String>> forms) {
        List<Member> memberList = forms.stream().map(form -> new Member(form.get(0),form.get(1))).collect(Collectors.toList());
        memberList.forEach(member -> setTwoLetterList(member));
        saveDuplicateMember();
        List<String> answer = new ArrayList<>(duplicateEmailList)
                .stream()
                .sorted()
                .collect(Collectors.toList());
        return answer;
    }

    private static void saveDuplicateMember(){
        for(String key : twoLetterList.keySet()){
            List<Member> currentMembers = twoLetterList.get(key);
            if(currentMembers.size()!=1){
                currentMembers.forEach(member -> duplicateEmailList.add(member.email));
            }
        }
    }
    private static void setTwoLetterList(Member member){
        String name = member.nickname;
        for(int i = 0; i < name.length()-1; i++){
            List<Member> members = new ArrayList<>();
            String slice = name.substring(i, i+2);
            if(twoLettersContainsKey(slice)) {
                twoLetterList.get(slice).add(member);
                continue;
            }
            members.add(member);
            twoLetterList.put(slice,members);
        }
    }
    private static boolean twoLettersContainsKey(String slice){
        return twoLetterList.containsKey(slice);
    }

    private static boolean validatecrewNumRange(int range){
        return range>=1 && range<=10000;
    }
    private static boolean validateEamilRange(int range){
        return range >= 11 && range < 20;
    }
    private static boolean validateEmail(String email){
        int atIndex = email.indexOf('@');
        String domain = email.substring(atIndex + 1);
        return domain.equals(CHECK_DOMAIN);
    }

    private static boolean isNicknameKorean(String nickname){
        return nickname.matches("^[가-힣]*$");
    }

    private static boolean validateNicknameRange(String nickname){
        return nickname.length() >= 1 && nickname.length() < 20;
    }
    private static class Member{
        private String email;
        private String nickname;

        Member(String email, String name){
            this.email = email;
            this.nickname = name;
        }
    }
}
