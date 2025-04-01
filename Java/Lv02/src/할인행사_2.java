import java.util.HashMap;

public class 할인행사_2 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            map.put(want[i], number[i]);
        } 
        System.out.println(map+"\n");

        for (int i=0; i<10; i++) {
            if (map.containsKey(discount[i])) {
                map.put(discount[i], map.get(discount[i])-1);
                System.out.println(map);
            }
        }
        System.out.println("\n"+map.keySet());
        
        if (isMatch(map)) {
            answer++;
        }

        for (int i=10; i<discount.length; i++) {
            if (map.containsKey(discount[i-10])) {
                map.put(discount[i-10], map.get(discount[i-10])+1);
            }
            if (map.containsKey(discount[i])) {
                map.put(discount[i], map.get(discount[i])-1);
            }
            if (isMatch(map)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isMatch (HashMap<String,Integer> map) {
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        할인행사_2 s = new 할인행사_2();
        System.out.println(s.solution(new String[] {"banana", "apple", "rice", "pork", "pot"}, new int[] {3, 2, 2, 2, 1}, new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }
}
