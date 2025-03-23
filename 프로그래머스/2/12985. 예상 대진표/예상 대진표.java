class Solution
{
    public int solution(int n, int a, int b)
    {
        int round = 0;

        // 참가자 번호 0부터 n-1까지
        a--;
        b--; 

        while (a!=b) {
            a /= 2;
            b /= 2;
            round++;
        }
        
        return round;
    }
}