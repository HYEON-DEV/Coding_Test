import java.util.Arrays;

public class 프178870__연속된부분수열의합 {

    public int[] solution(int[] sequence, int k) {
        int[] prefixsum = new int[sequence.length+1];
        for (int i=1; i<=sequence.length; i++) {
            prefixsum[i] = prefixsum[i-1] + sequence[i-1];
        }

        int[] answer = new int[2];
        int minLength = Integer.MAX_VALUE;

        for (int i=0; i<sequence.length; i++) {
            for (int j=i; j<sequence.length; j++) {
                int currentSum = prefixsum[j+1] - prefixsum[i];

                if (currentSum==k) {
                    int currentLength = j-i;
                    if (currentLength < minLength) {
                        minLength = currentLength;
                        answer[0] = i;
                        answer[1] = j;
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        프178870__연속된부분수열의합 s = new 프178870__연속된부분수열의합();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,3,4,5}, 7)));
        System.out.println(Arrays.toString(s.solution(new int[]{1,1,1,2,3,4,5}, 5)));
        System.out.println(Arrays.toString(s.solution(new int[]{2,2,2,2,2}, 6)));
    }
}