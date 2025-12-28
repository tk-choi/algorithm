class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        boolean isSqrt = sqrt * sqrt == n ? true : false;
        
        return isSqrt ? (sqrt + 1) * (sqrt + 1) : -1;
    }
}