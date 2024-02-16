package JavaKnowledge.File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/*
  知识记录
 */
public class Main {


    @Test
    public void study00() {
/*
    File构造方法：

    public File(String pathName)
          根据文件路径创建文件对象
    public File(String parent，string child)
        根据父路径名字符串(例下面的：C:\Users\13744\IdeaProjects\fileStudyDraft)和子路径（例：a.txt）名字符串创建文件对象
    public File(File parent, String child)
        根据父路径对应文件对象和子路径名字符串创建文件对象

    C:\Users\13744\IdeaProjects\fileStudyDraft
*/

        String path = "C:\\Users\\13744\\IdeaProjects\\fileStudyDraft\\a.txt";
        File file = new File(path);  //此部把原义为一个普通的字符串转成一个文件对象file，指向了具体的文件，放便后续对文件进行操作
        System.out.println(file);

    }


    @Test
    public void study01() throws IOException {
        /*
        File成员方法（创建、删除）：

        public boolean createNewFile()
        创建一个新的空的文件
        public boolean mkdir()
        创建单级文件夹
        public boolean mkdirs()
        创建多级文件夹
        public boolean delete()
        删除文件、空文件夹   */

        //1.createNewFile 创建一个新的空的文件
        //细节1:如果当前路径表示的文件是不存在的，则创建成功、方法返回truell如果当前路径表示的文件是存在的，则创建失败，方法返回falsel/细节2:如果父级路径是不存在的，那么方法会有异常IOException
        //细节3: createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件/*
        File f1 = new File("D:\\aaa\\ddd");
        boolean b1 = f1.createNewFile();
        System.out.println(b1); //true

        // 2.mkdir （make Directory）文件夹（目永)
        //细节1: windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false
        //细节2: mkdir方法只能创建单级文件夹，无法创建多级文件夹。
        File f2 = new File("D:\\aaa\\aaa\\bbb\\ccc");
        boolean b = f2.mkdir();
        System.out.println(b);

        // 3.mkdirs创建多级文件夹
        //细节:既可以创建单级的,又可以创建多级的文件夹
        File f3 = new File("D: \\aaa\\ggg");
        boolean b3 = f3.mkdirs();
        System.out.println(b3);

    }


    @Test
    public void study02() {
        /*
         File成员方法（获取并遍历）：
           常见成员方法：
           1.获取并遍历:  .listFiles()
         */
        File file = new File("C:\\Users\\13744\\dist");  //注：java中由于:\表示转义字符，故盘符路径一般用双反斜杠
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }


    }
}
