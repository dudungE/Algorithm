class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true; // 단어의 첫 글자인지 여부

        for (char c : s.toCharArray()) {
            if (isFirst) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
            isFirst = (c == ' '); // 공백이면 다음 글자가 단어의 첫 글자
        }
        return sb.toString();
    }
}