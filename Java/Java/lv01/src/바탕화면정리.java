package Java.Java.lv01.src;

/*
. #
최소한의 이동거리 한번의 드래그
정수배열 [lux,luy,rdx,rdy]

lux,luy,rdx,rdy -1 초기화
if (wallpaper[i] 에 # 있는지 체크) {
    if (lux < 0) lux = i;
    if (rdx < i+1) rdx = i+1;
    if (luy > #의위치) luy = #의위치
    if (rdy < #의위치) rdy = #의위치
}

    있으면 lux = i
            luy = wallpaper[i]의 위치
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 바탕화면정리 {

    public int[] solution(String[] wallpaper) {
        List<Integer> indexes = new ArrayList<>();
        int[] answer = new int[4];
        Arrays.fill(answer, -1);

        for (int i=0; i < wallpaper.length; i++) {
            String row = wallpaper[i];
            if (row.contains("#")) {
                indexes = IntStream.range(0, row.length())
                    .filter(w -> row.charAt(w) == '#')
                    .boxed()
                    .collect(Collectors.toList());
//                System.out.println(indexes);
                for (int idx : indexes) {
                    if (answer[0] < 0) answer[0] = i;
                    if (answer[1] > idx || answer[1] < 0) answer[1] = idx;
                    if (answer[2] < i+1) answer[2] = i+1;
                    if (answer[3] < idx+1) answer[3] = idx+1;
//                    System.out.printf("(%d,%d), (%d,%d)\n", answer[0], answer[1], answer[2], answer[3]);
                }
            }
//            else {
//                System.out.println("no");
//            }
        }

        return answer;
    }

    public static void main(String[] args) {
        바탕화면정리 s = new 바탕화면정리();
        System.out.println(Arrays.toString(s.solution(new String[] {".#...", "..#..", "...#."})));
        System.out.println(Arrays.toString(s.solution(new String[] {"..........", ".....#....", "......##..", "...##.....", "....#....."})));
        System.out.println(Arrays.toString(s.solution(new String[] {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})));
        System.out.println(Arrays.toString(s.solution(new String[] {"..", "#."})));
    }
}
