import java.util.Arrays;

public class 최솟값만들기 {
    
    /**
     * 1) A 오름차순 정렬
     * 2) B 내림차순 정렬
     * 3) 곱한 값 누적하기
     */

    public static int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        int size = A.length;

        for (int i=0; i<size; i++) {
            sum += A[i] * B[size-i-1];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,4,2}, new int[]{5,4,4}));
        System.out.println(solution(new int[]{1,2}, new int[]{3,4}));
    }
}
