package JavaKnowledge.a_draft;


import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class timeDraft {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void main() {
        Date now = new Date();
        TimeVO timeVO = modifyQueryDate(now.getTime() + "");
        System.out.println(timeVO);
    }

    private TimeVO modifyQueryDate(String longTime) { //传入的参数为时间毫秒值
        TimeVO timeVO = new TimeVO();
        if (StringUtils.isBlank(longTime) || "null".equals(longTime)) { //若传入的日期为空，取当天日期
            Map<String, String> dayMap = this.getDayOfWeek(new Date()); //得到这天的所在周的开始日期与结束日期
            timeVO.setStartDate(dayMap.get("startDate"));  //
            timeVO.setEndDate(dayMap.get("endDate"));
        } else {
            Map<String, String> dayMap = this.getDayOfWeek(new Date(Long.parseLong(longTime)));
            timeVO.setStartDate(dayMap.get("startDate"));
            timeVO.setEndDate(dayMap.get("endDate"));
        }
        return timeVO;
    }


    public Map<String, String> getDayOfWeek(Date day) {

//        try {
//            Date start = sdf.parse("2023-05-05 16:00:00");
//            Date end = sdf.parse("2023-05-16 12:00:00");
//            if (day.getTime() >= start.getTime() && day.getTime() <= end.getTime()) {
//                day = start;
//            }
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        Map<String, String> dayMap = new HashMap<>();
        Calendar c = Calendar.getInstance();
        c.setTime(day); // 将传进来的时间
        c.setFirstDayOfWeek(Calendar.MONDAY);  //将一周中的第一天设为星期五

        int dayWeek = c.get(Calendar.DAY_OF_WEEK);  //获取是本周中的 第几天 ，例：周一是第二天
        //这里的dayweek是用来减时间的
        if (dayWeek == 2) { //如果是周五
            int hour = c.get(Calendar.HOUR_OF_DAY);  //获取第几小时
            if (hour >= 16) { //如果是四点以后
                dayWeek = -1;
            }
        }
        if (dayWeek == 3) { //如果是周六
            dayWeek = 0;
        }
        c.add(Calendar.DATE, -dayWeek - 1);
        c.set(Calendar.HOUR_OF_DAY, 16);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        String startDate = sdf.format(c.getTime());
        dayMap.put("startDate", startDate);
        c.add(Calendar.DATE, 7);
        c.set(Calendar.HOUR_OF_DAY, 16);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        String endDate = sdf.format(c.getTime());
        dayMap.put("endDate", endDate);
        return dayMap;
    }

    @Test
    public void test() {

        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // 将传进来的时间
//      在时间上的加减用add（）！！！
        c.add(Calendar.YEAR, -1);

        String startDate = sdf.format(c.getTime());
        System.out.println(startDate);

    }

    @Test
    public void test01() {
      List<String> list=new ArrayList<>();
        String s = list.toString();
        System.out.println(s);
    }
}
