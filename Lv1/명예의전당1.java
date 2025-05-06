import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        int[] answer = new int[score.length];
        
        List<Integer> sorting = new ArrayList<>();
        
        for(int i = 0; i<score.length; i++){
            sorting.add(score[i]);
            Collections.sort(sorting, Comparator.reverseOrder());
            System.out.print(sorting.size()+ " ");  // ArrayList sorting.size() 값 넣는대로 커진다
            if (sorting.size() < k) answer[i] = sorting.get(sorting.size()-1);
            else answer[i] = sorting.get(k-1);
        }
        
    
        return answer;
    }
}