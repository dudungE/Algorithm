import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reporterMap = new HashMap<>();
        for (String id : id_list) {
            reporterMap.put(id, new HashSet<>());
        }
        
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            reporterMap.get(reporter).add(reported);
        }
        
        Map<String, Integer> reportedCount = new HashMap<>();
        for (Set<String> reportedSet : reporterMap.values()) {
            for (String reportedUser : reportedSet) {
                reportedCount.put(reportedUser, reportedCount.getOrDefault(reportedUser, 0) + 1);
            }
        }
        
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            Set<String> reportedUsers = reporterMap.get(user);
            int count = 0;
            for (String reportedUser : reportedUsers) {
                if (reportedCount.getOrDefault(reportedUser, 0) >= k) {
                    count++;
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}
