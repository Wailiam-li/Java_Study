package JavaKnowledge.a_draft;

import org.junit.Test;

import java.math.BigDecimal;
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


    @Test
    public void test03() {
        int[] num = {1, 3, 5, 6};
        int i = searchInsert(num, 5);
        System.out.println(i);
    }

    public int searchInsert(int[] nums, int target) {
        //请必须使用时间复杂度为 O(log n) 的算法————>二分查找
        int i = 0;
        int j = nums.length - 1;
        while (true) {
            if (nums[i] > target) {
                return i;
            }
            if (nums[j] < target) {
                return j;
            }
            if (i == j) {
                return i;
            }
            int mid = (i + j) / 2;
            if (nums[mid] > target) {
                j = mid;
            } else if (nums[mid] < target) {
                i = mid;
            } else {
                return mid;   //注：这里一定要以else结尾！
//            }else {  //未找到的情况
//
//            }


            }
        }
    }


    @Test
    public void test04() {
        String s = "H w";
        System.out.println(s.length());
//        String s1 = s.split(" ")[s.length() - 1];
        String[] s1 = s.split("");
        String s2 = s1[s1.length - 1];
//        System.out.println(s2);
        System.out.println(Arrays.toString(s1));
        for (int i = s1.length - 1; i >= 0; i--) {
            if (!s1[i].equals("")) {
                System.out.println(s1[i].length());
                break;
            }
        }
    }

    @Test
    public void test05() {   //"加一"
        int[] d = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        String s = plusOne(d);
        System.out.println(s);
    }

    public String plusOne(int[] digits) {
        //用到数学函数，多少次方
        int length = digits.length;//3
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = length - 1; i >= 0; i--) {
            sum = sum.add(new BigDecimal(digits[i]).multiply(new BigDecimal(Math.pow(10, length - i - 1))));
        }
        sum = sum.add(BigDecimal.ONE);
        String s = sum + "";
        String[] split = s.split("");
        int[] a = new int[s.length()];
        for (int i = 0; i < split.length; i++) {
            a[i] = Integer.valueOf(split[i]);
        }
        return Arrays.toString(a);
    }


    @Test
    public void test06() {
        String a = "11";
        String b = "1";
        String s = addBinary(a, b);
        System.out.println(s);

    }


    public String addBinary(String a, String b) {
        String[] a1 = a.split("");
        String[] b1 = b.split("");
        int length = a.length() > b.length() ? a.length() : b.length();
        //先把为空的填为“0”
        for (int i = 0; i < length; i++) {
            if (a1[i].equals("")) {
                a1[i] = "0";
            }
            if (b1[i].equals("")) {
                b1[i] = "0";
            }
        }
        int flag = 0;
        List<String> s = new ArrayList<>();
        for (int i = length - 1; i >= 0; i--) {
            if (Integer.valueOf(a1[i]) + Integer.valueOf(b1[i]) + flag == 2) {
                s.add("0");
                flag = 1;
            } else {
                s.add("1");
                flag = 0;
            }
        }
        List<String> s2 = new ArrayList<>();
        for (int i = s.size() - 1; i >= 0; i--) {
            s2.add(s.get(i));
        }
        if (s2.get(0).equals("0")) {
            s2.remove(0);
        }
        String s3 = s2.toString();
        return s3;

    }

}
