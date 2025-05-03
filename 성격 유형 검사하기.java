import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
    
        StringBuffer answer = new StringBuffer();
        Map<Character, Integer> hm = new HashMap<>();

        char[] personality = {'R', 'T',
                'C', 'F',
                'J', 'M',
                'A', 'N'};
        
        for ( char c : personality ) {
            hm.put(c, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            scoring(hm ,survey[i], choices[i]);
        }

        for (int i = 0; i < personality.length; i+=2) {
            if (hm.get(personality[i]) >= hm.get(personality[i+1])) {
                answer.append(personality[i]);
            } else {
                answer.append(personality[i+1]);
            }
        }

        return answer.toString();
    }

    public void scoring(Map<Character, Integer> hm, String s, int i) {
        int score = Math.abs(i - 4);
        if (i < 4) {
            char c = s.charAt(0);
            hm.put(c, hm.get(c) + score);
        } else {
            char c = s.charAt(1);
            hm.put(c, hm.get(c) + score);
        }
    }

    public static void main(String[] args) {

        Solution sol = new Solution();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        String res = sol.solution(survey, choices);
        System.out.println(res);

    }
}