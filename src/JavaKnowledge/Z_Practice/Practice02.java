package JavaKnowledge.Z_Practice;

/*
    吃葡萄问题:
           小明喜欢吃葡萄。仓库有n堆葡萄，第i堆中有s;颗葡萄。警卫已经离开了，
            将在h小时后回来。小明可以决定他吃葡萄的速度k(单位:颗/小时)。每个
            小时，他将会选择一堆葡萄，从中吃掉k颗，如果这堆葡萄少于k颗，他将吃掉
            这堆的所有葡萄,然后这一小时内不会再吃更多的葡萄。小明喜欢慢慢地吃葡萄,.
            但仍然想在警卫回来前吃掉所有的葡萄。
            计算他可以在h小时内吃掉所有葡萄的最小速度k (k为整数)
            ●
            要求:
            完成题目对应的程序模板(EatingGrape) 中的方法:
            int calcMinSpeed(int n，int h，int[] s);
            该方法的入口参数n为葡萄的堆数, h为警卫离开的小时数，s 为- -维整数
            数组，代表每堆葡萄的数量;
            最后输出结果为小明吃葡萄的最小速度k(k为整数)，这个最小速度k能保
            证小明在警卫回来之前把所有的葡萄吃完。

 */

import java.util.ArrayList;
import java.util.List;

public class Practice02 {
    public static void main(String[] args) {
        int l1 = calcMinSpeed(4, 8, new int[]{3, 6, 7, 11});
        System.out.println(l1);
        int l2 = calcMinSpeed(5, 5, new int[]{30, 11, 23, 4,20});
        System.out.println(l2);
        int l3 = calcMinSpeed(5, 6, new int[]{30, 11, 23, 4,20});
        System.out.println(l3);
    }

    public static int calcMinSpeed(int n, int h, int[] s) {
     //最小速度k能保证小明在警回来之前把所有的葡萄吃完
        int k = 0;
        if (n == h) {
            int max = 0;
            for (int i : s) {
                if (i > max) {
                    max = i;
                }
            }
            k = max;
        } else {
            int total = 0;
            for (int i : s) {
                total = total + i;
            }
            int minv =(int) Math.ceil((double) total / h) ; //向上取整 这里向上取 整出错了! ! ! !
            int times = 0;
            for (int i = 0; i < s.length; i++) { //每- 堆葡萄要吃的次数
                int time = (int) Math.ceil((double) s[i] / minv ); //向 上取整
                times = times + time;
                if (times <= h) { // 如果平均数够的话
                    k = minv;
                } else { // 平均数不够， 在数组中向上取接近 平均数的数       直接-一个个试，找符合的最小值
                    List<Integer> list = new ArrayList<>();
                    for (int i1:s) {
                        if (i1 > minv) { //把大于平均数的放- -集合里
                            list.add(i1);
                        }
                    }
                    int min=list.get(0);
                    for (Integer integer : list) {
                        int times1=0;
                        for (int i2: s) {
                            int time1 =(int) Math.ceil((double) i2 / integer); //向 上取整
                            times1 = times1 + time1;
                        }
                        if (times1 <= h && min >= integer) { // 如果平均数够的话
                            min = integer;
                        }
                        k = min;
                    }
                }
            }
        }
        return k;
    }
}