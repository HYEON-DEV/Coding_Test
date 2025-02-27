class Solution {
    public int solution(int n) {
        int cnt = 0;

        for (int i=1; i<n+1; i++) {
            int sum = 0;

            for (int j=i; j<n+1; j++) {
                sum += j;

                if(sum >= n ) {
                    cnt += sum==n? 1 : 0;
                    break;
                }
            }
        }

        return cnt;
    }
}