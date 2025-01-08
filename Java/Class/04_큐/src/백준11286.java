import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class 백준11286 {
    
    static class CustomComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            if(a[0] != b[0]) {
                return a[0]-b[0];
            } else {
                return a[1]-b[1];
            }
        }
    }

    public static List<Integer> solution(int[] xlist) {
        PriorityQueue<int[]> myQueue = new PriorityQueue<>(new CustomComparator());
        List<Integer> answer = new ArrayList<>();

        for(int x : xlist) {
            if (x!=0) {
                myQueue.add(new int[]{Math.abs(x), x});
            } else {
                if (myQueue.isEmpty()) {
                    answer.add(0);
                } else {
                    int[] temp = myQueue.poll();
                    answer.add(temp[1]);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] input = {1,-1,0,0,0,1,1,-1,-1,2,-2,0,0,0,0,0,0,0};
        백준11286 ex = new 백준11286();
        System.out.println(ex.solution(input));
    }
}
