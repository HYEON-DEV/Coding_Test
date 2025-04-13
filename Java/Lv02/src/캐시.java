import java.util.LinkedList;
import java.util.List;

public class 캐시 {

    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return 5*cities.length;

        List<String> cache = new LinkedList<>();
        int time = 0;

        for (String city : cities) {
            city = city.toLowerCase();

            // DB캐시에 없을 때
            if (!cache.contains(city)) {    // ⏰O(n)
                time += 5;
                cache.add(city);    // ⏰O(1)
                if (cache.size() > cacheSize) {
                    cache.remove(0);    // ⏰O(n)
                }
                System.out.printf("cache: %s,  time: %d \n", cache, time);
            } 
            // DB 캐시에 있을 때
            else {    
                time += 1;
                cache.remove(city);
                cache.add(city);
                System.out.printf("cache: %s,  time: %d \n", cache, time);
            }
        }
        
        return time;
    }

    public static void main(String[] args) {
        캐시 s = new 캐시();
        System.out.println(s.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        System.out.println();
        System.out.println(s.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        System.out.println();    
        System.out.println(s.solution(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println();    
        System.out.println(s.solution(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println();
        System.out.println(s.solution(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"}));
        System.out.println();
        System.out.println(s.solution(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
