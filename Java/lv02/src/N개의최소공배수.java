import java.util.Arrays;

public class N개의최소공배수 {
    public static int solution(int[] arr) {
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length-1; i++) {
            int num = getGCD(arr[i+1], arr[i]);     
            arr[i+1] = (arr[i]*arr[i+1]) / num;     
        }

        return arr[arr.length-1];
    }
    public static int getGCD(int n1, int n2) { 
        if (n1%n2==0) {
            return n2;
        }
        return getGCD(n2, n1%n2);   
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,6,8,14}));
        System.out.println(solution(new int[]{1,2,3}));
    }
}
