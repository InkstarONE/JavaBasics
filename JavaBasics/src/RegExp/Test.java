package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
//        p("abc".matches("..."));
//
//        p("a111a".replaceAll("\\d","-"));
//
//        Pattern p = Pattern.compile("[a-z]{3}");
//        Matcher m = p.matcher("fgh");
//        p(m.matches());
//
//        p("fghsad".matches("[a-z]{3}"));


        //初步认识 . * + ?
//        p("a".matches("."));
//        p("aa".matches("aa"));
//        p("aaa".matches("a*"));
//        p("aaaa".matches("a+"));
//        p("".matches("a*"));
//        p("aaaa".matches("a?"));
//        p("".matches("a?"));
//        p("a".matches("a?"));
//        p("2142424".matches("\\d{3,100}"));
//        p("192.168.0.2".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
//        p("192".matches("[0-2][0-9][0-9]"));

        //范围
//        p("a".matches("[abc]"));
//        p("c".matches("[^abc]"));
//        p("a".matches("[a-zA-z]"));
//        p("x".matches("[a-z|A-Z]"));
//        p("d".matches("[a-z&&asc]"));
//        p("A".matches("[a-z[A-z]]"));


        //认识\s \w \d \
//        p(" ／s/e/wd".matches("\\s"));
//        p(" ".matches("\\S"));
//        p("a_544".matches("\\w{5}"));
//        p("abc8888@$".matches("[a-z]{1,3}\\d+[@$]+"));
//        p("\\".matches("\\\\"));

        //POSIX STYLE
//        p("a".matches("\\p{Lower}"));

        //boundary
        p("hello sir".matches("^h.*"));
        p("hello sir".matches(".*ir$"));
        p("hello sir".matches("^h[a-z]{1,3}o\\b.*"));
        p("hellosir".matches("^h[a-z]{1,3}o\\b.*"));

        //white line
        p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
    }

    public static void p(Object o){
        System.out.println(o);
    }
}
