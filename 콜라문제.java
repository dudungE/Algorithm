class Solution {
    public int solution(int a, int b, int n) {
        int answer=0, spare = 0;
        
        while (n > 0) {
            
            if (n < a) break;

            answer += (n/a)*b;
            spare = n%a;
            n = (n/a)*b + spare;
        }
        return answer;
    }
}
