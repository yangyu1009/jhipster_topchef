package topchef.service.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateTimeUtils {
    public static String genCreateTime(){
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd");
        Date date = new Date();
        return sdf.format(date);
    }
}
