import java.util.LinkedList;
import java.util.Queue;


class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;

        int[] dx = {-1,1,0,0};  // 상하
        int[] dy = {0,0,-1,1};  // 좌우 

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0,0,1});     // x좌표, y좌표, 이동횟수 
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x=current[0], y=current[1], dist=current[2];
            
            // 도착지에 도달한 경우
            if (x==n-1 && y==m-1) {
                return dist;
            }

            // 4방향 탐색
            for (int i=0; i<4; i++) {
                int nx = x + dx[i];  // 다음 x좌표
                int ny = y + dy[i];  // 다음 y좌표 

                // 범위 안에 있고, 이동 가능한 칸이며, 방문하지 않았다면 
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[] {nx, ny, dist+1});  // 다음 위치 저장 
                } 
            }
        }

        return -1;

    }
}