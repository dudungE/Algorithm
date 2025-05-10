class Solution {
    public  static String toBinary(int n, int num) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(num%2);
            num = num/2;
        } 
        return sb.reverse().toString();
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        
        for (int i=0; i < n; i++) {
            StringBuilder tmp_string = new StringBuilder();
            for (int j=0; j <n; j++){
                if ((toBinary(n, arr1[i]).charAt(j) == '0') && (toBinary(n, arr2[i]).charAt(j) == '0')) {
                    tmp_string.append(' ');
                } else {
                    tmp_string.append('#');
                }// end if
            }// end inner for
            answer[i] = tmp_string.toString();
        }// end outer fo
        
        
        return answer;
    }
}