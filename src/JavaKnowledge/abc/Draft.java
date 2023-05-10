package JavaKnowledge.abc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Draft {
    public static void main(String[] args) throws ParseException {
        String date = "2023-04-24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(date);
        long time = parse.getTime();
        System.out.println(time);
    }
}
