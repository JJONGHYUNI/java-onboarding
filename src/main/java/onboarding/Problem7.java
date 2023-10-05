package onboarding;

import java.util.*;
import java.util.stream.Collectors;

public class Problem7 {
    private static final Map<String, Set<String>> friendList = new HashMap<>();
    private static final Map<String, Integer> answerList = new HashMap<>();
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = new ArrayList<>(Collections.emptyList());
        friends.forEach(Problem7::makeFriendList);
        addPointFriends(friendList.get(user));
        addPointVisitors(visitors);
        deleteFriendAndMe(user);
        answer = sortAnswerList();
        return answer;
    }

    private static List<String> sortAnswerList(){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(answerList.entrySet());
        list.sort((entry1, entry2) -> {
            int result = entry2.getValue().compareTo(entry1.getValue());
            if (result == 0) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
            return result;
        });
        return list.stream().map(entry -> entry.getKey()).collect(Collectors.toList());
    }
    private static void deleteFriendAndMe(String user){
        friendList.get(user).forEach(answerList::remove);
        answerList.remove(user);
    }
    private static void addPointVisitors(List<String> visitors){
        visitors.forEach(visitor ->{
            isPresendIdAndMakeByAnswerList(visitor);
            answerList.put(visitor,answerList.get(visitor) + 1);
        });
    }
    private static void addPointFriends(Set<String> friends) {
        friends.forEach(friend -> {
            friendList.get(friend).forEach(
                    temp -> {
                        answerList.put(temp, answerList.get(temp) + 10);
                    }
            );
        });
    }
    private static void isPresendIdAndMakeByAnswerList(String id){
        if(!answerList.containsKey(id)){
            answerList.put(id, 0);
        }
    }
    private static boolean isPresentIdByFriendList(String id){
        return friendList.containsKey(id);
    }
    private static void setFriendList(String id){
        friendList.put(id, new HashSet<>());
        answerList.put(id, 0);
    }
    private static void makeFriendList(List<String> friends){
        String friend1 = friends.get(0);
        String friend2 = friends.get(1);
        if (!isPresentIdByFriendList(friend1)){
            setFriendList(friend1);
        }
        if (!isPresentIdByFriendList(friend2)){
            setFriendList(friend2);
        }
        friendList.get(friend1).add(friend2);
        friendList.get(friend2).add(friend1);
    }


}
