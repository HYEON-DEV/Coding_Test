public class 프120806 {

    public int solution(int num1, int num2) {
        return (int)((double)num1/num2*1000);
    }

    public static void main(String[] args) {
        프120806 ex = new 프120806();

        System.out.println(ex.solution(3, 2));
    }
}