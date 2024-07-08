package JavaKnowledge.Annotation.annotationAnalysis;


@MyTest04(value = "王者荣耀", bbb = {"诸葛亮", "澜", "镜"})
public class AnnotationUse {

    @MyTest04(value = "诸葛亮", bbb = {"掌控之力", "黄金分割率", "时雨天司", "武陵仙君"})
    @MyTest02("李威")
    public void test01() {

    }

    @MyTest04(value = "元歌", bbb = {"午夜歌剧院", "云间偶戏", "无心"})
    @MyTest02("李威很帅")
    public void test02() {
    }

}
