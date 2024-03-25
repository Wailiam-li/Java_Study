package JavaKnowledge.a_draft;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date:2024/3/23 21:54
 * <p>
 * Description： 算法用例测试
 */
public class Test03 {

    @Test   //匹配两个字符串
    public void test01() {
        int i = strStr("sadbutsad", "sad");
        System.out.println(i);
    }

    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        //思路是对needle进行遍历，从haystack中进行匹配
        int resut = 0;
        //从 haystack一个字母一个字母进行匹配
        String[] split = haystack.split("");
        String[] split2 = needle.split("");
        int j = 0;
        for (int i = 0; i < split.length; i++) {
//            if (split[i].equals("")) {
//                return -1;
//            }
            if (split[i].equals(split2[j])) {  //如果比较成功，同时往后走；这里split2还是得从第一位开始比较
                resut += 1;
                j++;
                if (resut == split2.length) {
                    return i - split2.length + 1;
                }
            } else {
                //如果不成功，split全部元素向左移一位，split2从0开始继续比较
//                for (int i1 = 0; i1 < split.length - 1; i1++) {
//                    split[i1] = split[i1 + 1];   //这里移位后数组会变成什么样呢？
//                }
//                split[split.length - 1 - i] = "";
                j = 0;
            }
        }
        return -1;
    }


    @Test  //移除数组元素
    public void test02() {
        int[] a = {1, 1, 2};
        int i = removeDuplicates(a);
        System.out.println(i);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                }
            }
        }
//        int[]  nums1 = (int[])list.toArray(new int[list.size()]));  //把集合转成数组
        int[] num1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            num1[i] = list.get(i);
        }
        System.out.println(Arrays.toString(num1));
        return list.size();


    }

}
