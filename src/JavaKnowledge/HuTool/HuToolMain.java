package JavaKnowledge.HuTool;

import cn.hutool.core.io.FileUtil;

import java.util.List;

/*
  Hutool工具包中 文件类 相关的一些常用的方法:
            Fileutil类:
                   file:根据参数创建一个file对象。
                   touch:根据参数创建文件。
                   writeLines:把集合中的数据写出到文件中，覆盖模式。
                   appendLines:把集合中的数据写出到文件中，续写模式。
                   readLines:指定字符编码，把文件中的数据，读到集合中。
                   copy:拷贝文件或者文件夹

 */
public class HuToolMain {

    public static void main(String[] args) {

        //file:根据参数创建一个file对象。          注：这里写了绝对路径，在别的电脑使用时要注意。
//        File aaa = FileUtil.file("C:\\", "Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\HuTool", "aaa","a.txt");
//        System.out.println(aaa);
//
//        //touch:根据参数创建文件。   注：可以将父级路径一起创建
//        File touch = FileUtil.touch(aaa);
//        System.out.println(touch);
//
//        //writeLines:把集合中的数据写出到文件中，覆盖模式。  注：会把之前文件中的内容覆盖掉。  感觉整个跟爬虫有关！！
//        ArrayList<String> list=new ArrayList<>();
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//        File file = FileUtil.writeLines(list, "C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\HuTool\\aaa\\a.txt", "UTF-8");
//        System.out.println(file);                     //注意：这里还是要使用绝对路径才有用


        //appendLines:把集合中的数据写出到文件中，续写模式。 即:追加写入
//        ArrayList<String> list1=new ArrayList<>();
//        list1.add("ddd");
//        list1.add("eee");
//        list1.add("fff");
//        File file1 = FileUtil.appendLines(list1, "C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\HuTool\\aaa\\a.txt", "UTF-8");
//        System.out.println(file1);


        //readLines:指定字符编码，把文件中的数据，读到集合中。      注：1.第三个参数为集合，不写的话 方法可以自动创建一个集合
        List<String> list2 = FileUtil.readLines("C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\HuTool\\aaa\\a.txt", "UTF-8");
        System.out.println(list2);                          // 2.读取时，默认一行为集合中的一个元素


    }
}
