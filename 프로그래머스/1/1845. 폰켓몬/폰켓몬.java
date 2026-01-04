import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> choice = new HashSet<>();
        int maxChoice = nums.length / 2;
        
        for (int i : nums) {
            choice.add(i);
        }

        return maxChoice < choice.size() ? maxChoice : choice.size();
    }
}