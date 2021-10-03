import java.time.ZonedDateTime;

/**
 * @Author: ChaR
 * @Date: 2021/10/3 18:35
 */
public class T2 {

    public static void main(String[] args) {
        //获取当前时区时间
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);

        //2021-10-03T18:36:07.839+08:00[Asia/Shanghai]
    }
}
