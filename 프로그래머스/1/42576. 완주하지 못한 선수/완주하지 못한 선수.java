import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String p : participant) {
            Integer pValue = map.get(p);
            
            if (pValue == null) {
                map.put(p, 1);    
            } else {
                map.put(p, pValue + 1);
            }
        }
        
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        
        return "";
    }
}