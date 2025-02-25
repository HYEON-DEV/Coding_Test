public class JadenCase문자열만들기_2 {

    public String solution(String s) {
        String answer = "";

        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for (String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }

    public static void main(String[] args) {
        JadenCase문자열만들기_2 s = new JadenCase문자열만들기_2();
        System.out.println(s.solution("3people unFollowed me"));
        System.out.println(s.solution("for the last week"));
    }
    
}
