import java.util.Arrays;

public class 피로도 {
    static int maxCount = 0;
    static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        System.out.println(Arrays.toString(visited));
        dfs(k, dungeons, 0);
        return maxCount;
    }

    private void dfs(int current, int[][]dungeons, int cnt) {
        System.out.printf("[dfs]  current: %d,  cnt: %d \n", current, cnt);
        maxCount = Math.max(maxCount, cnt);
        System.out.println("maxCount: " + maxCount);

        for (int i=0; i<dungeons.length; i++) {
            System.out.printf("current: %d,  cnt: %d \n", current, cnt);

            int min = dungeons[i][0];
            int consume = dungeons[i][1];
            System.out.printf("min: %d,  consume: %d \n", min, consume);

            if (!visited[i] && current>=min) {
                visited[i] = true;
                System.out.println(Arrays.toString(visited));
                dfs(current-consume, dungeons, cnt+1);
                visited[i] = false;
                System.out.println(Arrays.toString(visited));
            }
        }
    }
    
    public static void main(String[] args) {
        피로도 s = new 피로도();
        System.out.println(s.solution(80, new int[][] {{80,20},{50,40},{30,10}}));
    }
}