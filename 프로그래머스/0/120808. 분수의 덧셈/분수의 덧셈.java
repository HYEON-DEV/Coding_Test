class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = numer1*denom2 + numer2*denom1;

        int max = 1;
        for (int i=1; i<denom+1 && i<numer+1; i++) {
            if(denom%i==0 && numer%i==0) {
                max = i;
            }
        }

        int[] answer = {numer/max, denom/max};
        return answer;
    }
}