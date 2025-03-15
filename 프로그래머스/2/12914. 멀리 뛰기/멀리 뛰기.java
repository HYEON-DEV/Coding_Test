class Solution {
    public long solution(int n) {
        long[] f = new long[n+2];
        f[1] = 1;
        f[2] = 2;
        
        if(n>2) {
            for (int i=3; i<n+1; i++) {
                f[i] = (f[i-2]+f[i-1]) % 1234567;
            }
        }

        return f[n];
    }
}