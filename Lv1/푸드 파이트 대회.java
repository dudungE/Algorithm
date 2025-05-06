class Solution {
    public String solution(int[] food) {
        
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
         for(int i = 1; i<food.length; ++i) 
            sb.append(("" + i).repeat(food[i]/2) );
            
        answer += sb;
        answer += "0";
        answer += sb.reverse();      
        
        return answer;
    }
}