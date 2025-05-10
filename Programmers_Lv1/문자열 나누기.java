

class Solution {
    public int solution(String s) {
        int answer = (s.length()%2==0) ? 0:1;
        int numX = 0;
        int numNotX = 0;
        String temp ="";
        char X = ' ';
        int idx = 0;
        // "abracadabra";
        for (int i=0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
            X = s.charAt(idx);

            if (s.charAt(i) == X) {
                temp += s.charAt(i); numX++;
            } else {
                temp += s.charAt(i); numNotX++;
            }

            if (numX == numNotX) {
                System.out.println(temp);
                temp = "";
                idx = i+1;
                answer ++;
            }
        }

            return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abracadabra";
        sol.solution(s);
        System.out.println(sol.solution(s));

    }
}