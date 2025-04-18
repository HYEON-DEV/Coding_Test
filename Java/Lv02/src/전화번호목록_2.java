import java.util.Arrays;

public class 전화번호목록_2 {

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        System.out.println(Arrays.toString(phone_book));

        for (int i=0; i<phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        전화번호목록_2 s = new 전화번호목록_2();
        System.out.println(s.solution(new String[] {"119", "97674223", "1195524421"}));
        System.out.println();
        System.out.println(s.solution(new String[] {"123","456","789"}));
        System.out.println();
        System.out.println(s.solution(new String[] {"12","123","1235","567","88"}));
    }
}