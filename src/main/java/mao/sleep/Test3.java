package mao.sleep;

import java.util.concurrent.TimeUnit;

/**
 * Project name(项目名称)：java并发编程_sleep和yield
 * Package(包名): mao.sleep
 * Class(类名): Test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/26
 * Time(创建时间)： 20:38
 * Version(版本): 1.0
 * Description(描述)： 建议用 TimeUnit 的 sleep 代替 Thread 的 sleep 来获得更好的可读性
 */

public class Test3
{
    public static void main(String[] args) throws InterruptedException
    {
        //------------------------------------------------------
        long startTime = System.currentTimeMillis();    //获取开始时间
        //------------------------------------------------------

        TimeUnit.SECONDS.sleep(2);
        //两秒
        //TimeUnit.MINUTES.sleep(1);
        //一分钟

        //------------------------------------------------------
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
        //------------------------------------------------------
    }
}
