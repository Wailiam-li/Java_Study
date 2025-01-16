package JavaKnowledge.IO.Byte;

/**
 * @author Liweiwei
 * @Date 2024/10/20 12:03
 * @Description :演示 byte与bit之间的转换
 */
public class ByteDemo {

    /**
     * 根据编码的格式不一样，对应的字节也不一样*如果是UTF-8:一个中文对应的是三个字节*如果是GBK :一个中文对应的是二个字节
     **/
    public static void main(String[] args) throws Exception {
        String a = "李a";
        byte[] bytes = a.getBytes(); //得到两个字节。 如果里面不穿参数默认是UTF-8
//        byte[] bytes = a.getBytes("GBK"); //得到两个字节。 如果里面不穿参数默认是UTF-8
        for (byte aByte : bytes) {
            System.out.println(aByte);  //每个字节对应着一个数字
            System.out.println(Integer.toBinaryString(aByte)); //这里是直接转成二进制字符串
            System.out.println("-------------------");
        }






    }

}
