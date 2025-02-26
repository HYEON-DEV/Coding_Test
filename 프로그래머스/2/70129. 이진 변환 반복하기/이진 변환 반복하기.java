class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};

        while (!s.equals("1")) {
            int before = s.length();
            s = s.replaceAll("0", "");
            int after = s.length();

            answer[1] += before - after;    // 제거한 0의 개수

            s = Integer.toBinaryString(after);  // 이진변환

            answer[0]++;
        }

        return answer;
    }
}