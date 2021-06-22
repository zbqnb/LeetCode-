import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode179 {
    public String largestNumber(int[] nums) {
    return null;
    }

    public int compare(String o1, String o2) {
        //继承此方法的时候，要自定义比较器，conpareTo方法返回值为1(升序),0，-1(降序)。
        //返回正值 交换；负值不交换
        return (o2 + o1).compareTo((o1 + o2));
    }



}
