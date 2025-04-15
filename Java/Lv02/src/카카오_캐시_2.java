import java.util.LinkedHashMap;

public class 카카오_캐시_2 {

    public int solution(int cacheSize, String[] cities) {
        if (cacheSize==0)   return cities.length*5;

        int time = 0;

        LinkedHashMap<String, Boolean> cache = new LinkedHashMap<>(cacheSize, 0.75f, true); // 0.75f is the default load factor

        for (String city : cities) {    // ⏰O(n)
            city = city.toLowerCase();  // ⏰O(n)

            if (cache.containsKey(city)) {  // ⏰O(1) 해시기반검색
                time += 1;
                cache.get(city); // ✅ get/put 데이터 접근시, 그 항목이 가장 뒤로 이동된다 / ⏰O(1)
            } else {
                time += 5;
                if (cache.size() >= cacheSize) {
                    cache.remove(cache.keySet().iterator().next()); // ⏰O(1)
                    // ✅ key목록 순서대로 반환  =>  순서대로 순회할 수 있는 반복자 생성  =>  첫번째 key 꺼내기 
                }
                cache.put(city, true);  // ⏰O(1)
            }
        }

        return time;
    }

    public static void main(String[] args) {
        카카오_캐시_2 s = new 카카오_캐시_2();
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
