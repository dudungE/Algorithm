class Solution {
    public int solution(String s) {
        
        String[] tmp_string = {"zero", "one", "two", "three", "four", "five", "six",  "seven", "eight", "nine" };
        
        for(int i=0; i< tmp_string.length;i++) {
            if (s.contains(tmp_string[i])) {
                s = s.replaceAll(tmp_string[i], Integer.toString(i));
            }
        }
    
        return Integer.parseInt(s);
    }
}