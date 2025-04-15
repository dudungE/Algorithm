
import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        List<Character> list = new ArrayList<>();

        for (int i=97; i<123; i++) {
            if (skip.contains(String.valueOf((char)i))) continue;
            list.add((char)i);
        }

        char[] strings = s.toCharArray();
        
        for(int i=0; i<strings.length; i++) {
            if (list.contains(strings[i])) {
                int targetIdx = list.indexOf(strings[i]) + index;
                if (targetIdx >= list.size()) answer += list.get(targetIdx - list.size());
                else answer += list.get(targetIdx);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();


        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        sol.solution(s, skip, index);

    }
}