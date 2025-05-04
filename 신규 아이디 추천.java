class Solution {
    public String solution(String new_id) {
        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        // [^...] : 괄호 안에 없는 문자들을 찾음 (부정)
        // a-z0-9 : 알파벳 소문자와 숫자
        // -_.    : 하이픈, 밑줄, 마침표
        // ex) "abc!@#123" → "abc123"

        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");
        // \\.   : 마침표 하나
        // {2,}  : 2번 이상 반복
        // 예: "a..b...c" → "a.b.c"

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        // ^\\. : 문자열 시작에서 마침표
        // \\. $ : 문자열 끝에서 마침표
        // | : 또는
        // ex) ".abc." → "abc"

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입
        if (new_id.isEmpty()) {new_id = "a";}

        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        //    만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            // substring(0, 15) : 인덱스 0부터 14까지 자름
            // ex) "abcdefghijklmno1234" → "abcdefghijklmno"
            // 잘라낸 후 끝에 마침표가 있다면 제거
            new_id = new_id.replaceAll("\\.$", "");
        }


        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙이기
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
            // ex) "ab" → "abb", "a" → "aaa"
        }
        return new_id;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        String new_id = "...!@BaT#*..y.abcdefghijklm";

        String res = sol.solution(new_id);
        System.out.println(res);

    }
}