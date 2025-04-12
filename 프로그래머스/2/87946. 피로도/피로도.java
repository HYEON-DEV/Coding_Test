class Solution {
    static int maxCount = 0;
    static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return maxCount;
    }

    private void dfs(int current, int[][]dungeons, int cnt) {
        maxCount = Math.max(maxCount, cnt);

        for (int i=0; i<dungeons.length; i++) {
            int min = dungeons[i][0];
            int consume = dungeons[i][1];

            if (!visited[i] && current>=min) {
                visited[i] = true;
                dfs(current-consume, dungeons, cnt+1);
                visited[i] = false;
            }
        }
    }
}