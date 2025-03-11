import java.util.Arrays;

public class 카펫 {

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for(int i=3; i<brown+yellow; i++) {
            int width = (brown+yellow)/i;
            if(width>=i) {
                if((i-2)*(width-2) == yellow) {
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));    // 2*1 => 2*2 + 1*2 + 4 => [2+2, 1+2]
        System.out.println(Arrays.toString(solution(8,1)));      // 1*1 => 1*2 + 1*2 + 4 => [1+2, 1+2]
        System.out.println(Arrays.toString(solution(24,24)));    // 6*4 => 6*2 + 4*2 + 4 => [6+2, 4+2]
        // 24-4=20, 20/2=10, 가로+세로=10
        //1*9 2*8 3*7    "4*6"
        /*
        row + col = (brown-4)/2
        row * col = yellow
        col = (brown-4)/2 - row
        row * ((brown-4)/2 - row) = yellow
        row >= col
         */
    }
}
