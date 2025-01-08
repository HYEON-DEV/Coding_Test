import java.util.ArrayList;

public class 백준11659_구간합 {
    
    public int solution(int[] numbers, int left, int right) {

        int result = 0;
        int temp = 0;
        ArrayList<Integer> prefixSum = new ArrayList<>(); 
        prefixSum.add(0);

        for (int n : numbers) {
            temp += n;
            prefixSum.add(temp);
        }

        result = prefixSum.get(right+1) - prefixSum.get(left);

        return result;
    }

    public static void main(String[] args) {
        백준11659_구간합 ex = new 백준11659_구간합();

        System.out.println(ex.solution(new int[]{5,4,3,2,1}, 0, 2));
        System.out.println(ex.solution(new int[]{5,4,3,2,1}, 1, 3));
        System.out.println(ex.solution(new int[]{5,4,3,2,1}, 4, 4 ));
    }
}
