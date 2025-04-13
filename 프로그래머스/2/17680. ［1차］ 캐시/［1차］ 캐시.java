import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return 5*cities.length;

        List<String> cache = new LinkedList<>();
        int time = 0;

        for (int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
            
            // DB캐시에 없을 때
            if (!cache.contains(cities[i])) {
                time += 5;
                cache.add(cities[i]);
                if (cache.size() > cacheSize) {
                    cache.remove(0);
                }
            } 
            // DB 캐시에 있을 때
            else {    
                time += 1;
                cache.remove(cities[i]);
                cache.add(cities[i]);
            }
        }
        
        return time;
    }
}