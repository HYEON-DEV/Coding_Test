package Java.Java.lv01.src;

import java.util.Arrays;

public class 바탕화면정리_2 {

    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        Arrays.fill(answer, -1);
        int left, right;
        int minL = 51;
        int maxR = -1;

        for (int i=0; i<wallpaper.length; i++) {
            left = wallpaper[i].indexOf('#');
            // 행에 #이 있으면 진행, 없으면 패스
            if (left < 0) continue;

            // #이 처음 발견된 행
            if (answer[0] < 0) answer[0] = i;
            // #이 발견될때마다 행 값 갱신
            answer[2] = i+1;

            // 행에서 #이 처음 발견된 열 값 갱신
            minL = Math.min(left, minL);

            // 행에서 #이 마지막으로 발견된 열 값 갱신
            right = wallpaper[i].lastIndexOf('#');
            maxR = Math.max(right, maxR);
        }

        answer[1] = minL;
        answer[3] = maxR+1;

        return answer;
    }

    public static void main(String[] args) {
        바탕화면정리_2 s = new 바탕화면정리_2();
        System.out.println(Arrays.toString(s.solution(new String[] {".#...", "..#..", "...#."})));
        System.out.println(Arrays.toString(s.solution(new String[] {"..........", ".....#....", "......##..", "...##.....", "....#....."})));
        System.out.println(Arrays.toString(s.solution(new String[] {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})));
        System.out.println(Arrays.toString(s.solution(new String[] {"..", "#."})));
    }
}
