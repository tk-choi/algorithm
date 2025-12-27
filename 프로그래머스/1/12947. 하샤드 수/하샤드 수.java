class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        String[] arrStr = str.split("");
        int sum = 0;
        
        for (String item : arrStr) {
            sum += Integer.parseInt(item);
        }
        
        return x % sum == 0 ? true : false;
    }
}