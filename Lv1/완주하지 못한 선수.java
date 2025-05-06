import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //hasp map 생성
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            //getOrDefualt : player의 값을 가진 key를 가져와서 없으면 0을 가져와서 1을 더하고,
            //있으면 그 값을 가져와서 1을 더한다.
            map.put(player, map.getOrDefault(player, 0) + 1);

        //Hash map에서 완주한 사람 빼기
        for (String player : completion)
            //기존의 있던 값을 가져와서 -1 한다
            map.put(player, map.get(player) - 1);

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();


        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};


        String result = sol.solution(participant, completion);
        System.out.println(result);
    }
}

