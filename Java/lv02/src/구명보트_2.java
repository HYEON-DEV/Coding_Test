import java.util.Arrays;

public class 구명보트_2 {
    
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);    
        int i=0, j=people.length-1;

        for(; i<j; --j) {
            if(people[i] + people[j] <= limit)
                i++;
        }
        
        return people.length-i;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(new int[] {70,50,80,50}, 100));
        System.out.println(solution(new int[] {70,80,50}, 100));
    }
}
