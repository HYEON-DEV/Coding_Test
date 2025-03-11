import java.util.Arrays;

public class 구명보트 {
    
    public static int solution(int[] people, int limit) {

        Arrays.sort(people);
        int cnt = 0;
        int left = 0;
        int right = people.length-1;

        while( left <= right ) {
            if (people[left]+people[right] <= limit) {
                left++;
            } 
            right--;
            cnt++;
        }

        
        return cnt;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(new int[] {70,50,80,50}, 100));
        System.out.println(solution(new int[] {70,80,50}, 100));
    }
}
