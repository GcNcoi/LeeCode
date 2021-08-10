/*
* 5.有效的括号
* 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s
* 判断字符串是否有效。
*
* */

public class Test05 {

    public static void main(String[] args) {
        Test05 ts = new Test05();
        String strs = "{}";
         System.out.println(ts.isValid(strs));
    }

    public boolean isValid(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return s.length() == 0;
    }
}
