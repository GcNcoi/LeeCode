/*
* 4. 最长公共前缀
* */
/*
* 编写一个函数来查找字符串数组中的最长公共前缀。
* 如果不存在公共前缀，返回空字符串 ""。
* */
public class Test04 {
    public static void main(String[] args) {
        Test04 ts = new Test04();
        String[] strs = new String[]{"zaaa","xaaavb","aasdfe"};
        System.out.println(ts.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }else {
            String str = strs[0];
            for(int i=1;i<strs.length;i++){
                while(strs[i].indexOf(str)!=0){
                    str=str.substring(0,str.length()-1);
                }
            }
            return str;
        }
    }
}
