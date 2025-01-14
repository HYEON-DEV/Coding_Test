package Java.Class.입문.src;

import java.util.Arrays;

public class 프120811_중앙값구하기 {

    public int solution(int[] array) {
        Arrays.sort(array);
        // System.out.println(Arrays.toString(array));
        return array[(array.length/2)];
    }

    public static void main(String[] args) {
        프120811_중앙값구하기 ex = new 프120811_중앙값구하기();
        System.out.println(ex.solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(ex.solution(new int[]{9, -1, 0}));
    }
}