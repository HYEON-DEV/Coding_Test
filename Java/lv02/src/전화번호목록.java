/*
원소 길이별로 정렬
for (배열) {
    phonebook[i+1] 이 phonebook[i] 포함하는지 
}
 */

import java.util.Arrays;

public class 전화번호목록 {

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, (a,b) -> {return a.length() - b.length();});
        System.out.println(Arrays.toString(phone_book));

        for (int i=0; i<phone_book.length-1; i++) {
            for (int j=i+1; j<phone_book.length; j++) {
                System.out.printf("cur: %s,  compare: %s \n", phone_book[i], phone_book[j]);
                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        전화번호목록 s = new 전화번호목록();
        System.out.println(s.solution(new String[] {"119", "97674223", "1195524421"}));
        System.out.println();
        System.out.println(s.solution(new String[] {"123","456","789"}));
        System.out.println();
        System.out.println(s.solution(new String[] {"12","123","1235","567","88"}));
    }
}