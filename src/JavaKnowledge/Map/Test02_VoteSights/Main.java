package JavaKnowledge.Map.Test02_VoteSights;

import java.util.*;

/**
 * 统计投票计数：80个人，依次给四个景点A,B,C,D投票，每个人只能选择一个，统计出哪个景点票数最多。
 */
public class Main {
    public static void main(String[] args) {
        //判断是否是第一次出现：第一次出现——>创建   第二次——>值+1
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);    // arr.length 表示数组的长度，r.nextInt()表示从中随机取一个数
            // System.out.println(arr[index]);
            list.add(arr[index]);  // 这里index是随机的，将数组下标对应的随机一个数加入list集合中；
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            if (hm.containsKey(name)) {
                //获取当前景点得票数
                int count = hm.get(name);
                //表示被投一次
                count++;
                //把新的次数再次添加到集合中
                hm.put(name, count);
            } else {
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        //求景点投票数最多的景点：由于景点最低投票可以为0，因此应该初始化最大值为0！！
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        int max = 0;
        String view = "";
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
                // view=entry.getKey();   //这里考虑两个景点票数一样的情况，这种代码下只能输出一个票数最高的一个景点
            }
        }

        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {   //如果是等于最大值（可能多个）就输出
                view = entry.getKey();
                System.out.println("最多票数是" + view + "景点：" + max + "票");
            }
        }
    }
}
