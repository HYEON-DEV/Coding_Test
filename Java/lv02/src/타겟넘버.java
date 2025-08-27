public class 타겟넘버 {

    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }

    private int dfs(int[] numbers, int index, int currentSum, int target) {
        // 모든 숫자를 다 사용한 경우
        if (index == numbers.length) {
            System.out.println("index: " + index + ", currentSum: " + currentSum);
            // 목표값에 도달하면 1 반환, 아니면 0 반환
            return currentSum == target ? 1 : 0;
        }

        System.out.println("index: " + index + ", currentSum: " + currentSum);

        // 현재 숫자에 대해 더하거나 빼는 두 가지 경우를 재귀적으로 탐색
        int add = dfs(numbers, index+1, currentSum+numbers[index], target);
        System.out.println("After adding " + numbers[index] + ", add: " + add);
        int subtract = dfs(numbers, index+1, currentSum-numbers[index], target);
        System.out.println("After subtracting " + numbers[index] + ", subtract: " + subtract);

        // 두 경우의 합 반환
        return add + subtract;
    }

    public static void main(String[] args) {
        System.out.println(new 타겟넘버().solution(new int[] {1,1,1,1,1}, 3));
        System.out.println(new 타겟넘버().solution(new int[] {4,1,2,1}, 4));
    }
}
