import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, String> hm = new HashMap<>();

        for (String s : terms) {
            hm.put( splitString(s, 0),  splitString(s, 1));
        }
        Loop:
        for (int i = 0; i < privacies.length; i++) {
            String plusDate =  hm.get(splitString(privacies[i], 1));
            LocalDate todayDate = parseDate(today);
            LocalDate targetDate = parseDate(splitString(privacies[i], 0)).plusMonths(Integer.parseInt(plusDate));
            if (targetDate.isAfter(todayDate)) {
                continue Loop;
            }
            
            answer.add(i + 1);
        }

        return answer;
    }
    public static String splitString(String s, int i) {
        return s.split(" ")[i];
    }

    public static LocalDate parseDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String today = "2022.05.19"	;
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        sol.solution(today, terms, privacies);
    }
}