package onboarding;

import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }

    private static class Member{
        private String email;
        private String name;
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
