class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        String str = "";
        for (int i = 0; i < ingredient.length; i++) {str += ingredient[i];}
        
        while (str.contains("1231")) {
            str = str.replace("1231", "");
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();


        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(sol.solution(ingredient));
    }
}