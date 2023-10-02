package onboarding;

import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {
    private final static String CHECK_DOMAIN = "email.com";
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        List<Member> memberList = forms.stream().map(form -> new Member(form.get(0),form.get(1))).collect(Collectors.toList());

        return answer;
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
        private boolean duplicated;

        Member(String email, String name){
            this.email = email;
            this.name = name;
            this.duplicated = false;
        }

        public String getEmail() {
            return email;
        }

        public String getName() {
            return name;
        }

        public boolean isDuplicated() {
            return duplicated;
        }

        public void setDuplicated() {
            this.duplicated = true;
        }
    }
}
