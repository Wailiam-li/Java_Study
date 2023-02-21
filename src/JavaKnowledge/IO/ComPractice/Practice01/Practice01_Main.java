package JavaKnowledge.IO.ComPractice.Practice01;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
   综合练习01 ：  文章排序：在某个文件中每一句单独成行，并且每行前有序号，要求对有序的每一行进行排序 形成整篇文章
 */
public class Practice01_Main {
    public static void main(String[] args) throws IOException {
        //这里由于是文本、又是读取每一行 考虑使用 字符缓冲流

        //创建读取文件对象
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\ComPractice\\Practice01\\chibifu.txt"));
        //创建写入对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\ComPractice\\Practice01\\result.txt"));

        String b;
        TreeMap<Integer, String> tm = new TreeMap<>();
        //先加入TreeMap集合中，再遍历集合逐条写入
        while ((b = (br.readLine())) != null) {
            Integer key = Integer.parseInt(b.split("\\.")[0]);  //注：1.这里一定要有转义字符，不然无法识别符号“.”
            String value = b.split("\\.")[1];                   //2.原文中不能换行，不然的话b为空，无法往下运行
            tm.put(key, b);
//            bw.write(b);
        }

        /*
            知识记录：TreeMap集合是可以排序的，默认按键值从小到大进行排序
         */
        //对集合这一步还是不够熟悉！！  要用,entrySet()才能获取Map.Entry！！
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> line : entries) {                 //卡死！！！
            bw.write(line.getValue());       //注：这里的write只能写进去String类型的
            bw.newLine();                //表示换行
        }


        //关闭资源
        bw.close();
        br.close();

    }
}
