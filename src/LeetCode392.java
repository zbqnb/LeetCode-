public class LeetCode392 {
    /*
    示例 1:
s = "abc", t = "ahbgdc"

返回 true.

示例 2:
s = "axc", t = "ahbgdc"

返回 false.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/is-subsequence
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public boolean isSubsequence(String s, String t) {
   //双指针
        int i = 0;
        int j = 0;
        int  count = 0;
        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                count++;
            } else {
                j++;
            }
        }
        if (count == t.length()){
            return true;
        } else return false;

    }
}
