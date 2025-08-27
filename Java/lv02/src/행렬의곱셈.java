
/*
2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하
행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수

answer[0][0] = arr1[0][0]*arr2[0][0] + arr1[0][1]*arr2[1][0];
answer[0][0] = arr1[0][0]*arr2[0][0] + arr1[0][1]*arr2[1][0] + arr1[0][2]*arr2[2][0];
answer[0][1] = arr1[0][0]*arr2[0][1] + arr1[0][1]*arr2[1][1] + arr1[0][2]*arr2[2][1];

answer[1][0] = arr1[1][0]*arr2[0][0] + arr1[1][1]*arr2[1][0] + arr1[1][2]*arr2[2][0];
 */

import java.util.Arrays;

public class 행렬의곱셈 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int size1 = arr1.length;
        int size2 = arr2[0].length;
        int[][] answer = new int[size1][size2];

        for (int i=0; i<size1; i++) {
            for (int j=0; j<size2; j++) {
                for (int k=0; k<arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
                
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        행렬의곱셈 s = new 행렬의곱셈();
        System.out.println(Arrays.deepToString(s.solution(new int[][] {{1, 4}, {3, 2}, {4, 1}}, new int[][] {{3,3},{3,3}})));    
        System.out.println(Arrays.deepToString(s.solution(new int[][] {{2,3,2}, {4,2,4}, {3,1,4}}, new int[][] {{5,4,3},{2,4,1},{3,1,1}})));    
    }
}
