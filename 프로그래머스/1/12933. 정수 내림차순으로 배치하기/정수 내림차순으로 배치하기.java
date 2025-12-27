import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        String[] arr = str.split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (String item : arr) sb.append(item);
        
        return Long.parseLong(sb.toString());
    }
}