
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JadenCase문자열만들기_3 {

    public String solution(String s) {
        // 단어의 첫 글자와 나머지 글자를 그룹으로 나누는 정규 표현식을 컴파일한다.
        // \\b: 단어 경계를 나타낸다. 단어의 시작이나 끝을 의미
        // ([\\w]): 단어의 첫 글자를 캡처하는 그룹
        // ([\\w]*): 단어의 나머지 글자를 캡처하는 그룹
        // matcher(s): 입력 문자열 s에 대해 매칭 작업을 수행하는 Matcher 객체를 생성한다.
        Matcher m = Pattern.compile("\\b([\\w])([\\w]*)").matcher(s);
        
        StringBuffer sb = new StringBuffer();

        // 입력 문자열에서 패턴과 일치하는 부분을 찾는다
        while (m.find()) {
            // 매칭된 부분을 대체하여 StringBuffer에 추가한다. 
            m.appendReplacement(sb, m.group(1).toUpperCase() + m.group(2).toLowerCase());
        }
        // 마지막으로 매칭되지 않은 부분을 StringBuffer에 추가한다.
        m.appendTail(sb);

        return sb.toString();
    }

    public static void main(String[] args) {
        JadenCase문자열만들기_3 s = new JadenCase문자열만들기_3();
        System.out.println(s.solution("3people unFollowed me"));
        System.out.println(s.solution("for the last week"));
    }
    
}
