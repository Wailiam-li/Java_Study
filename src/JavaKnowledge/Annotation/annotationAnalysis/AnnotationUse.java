package JavaKnowledge.Annotation.annotationAnalysis;


@MyTest04(value = "王者荣耀", bbb = {"诸葛亮", "澜", "镜"})
public class AnnotationUse {

    @MyTest04(value = "诸葛亮", bbb = {"掌控之力", "黄金分割率", "时雨天司", "武陵仙君"})
    public void test04() {

    }

    @MyTest02("元歌")
    public void test02() {
    }

}
