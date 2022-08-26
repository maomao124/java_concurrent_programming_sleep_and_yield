package mao.sleep;

/**
 * Project name(项目名称)：java并发编程_sleep和yield
 * Package(包名): mao.sleep
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/26
 * Time(创建时间)： 20:31
 * Version(版本): 1.0
 * Description(描述)： 睡眠结束后的线程未必会立刻得到执行
 */

public class Test2
{
    public static void main(String[] args) throws InterruptedException
    {
        //------------------------------------------------------
        long startTime = System.currentTimeMillis();    //获取开始时间
        //------------------------------------------------------

        Thread.sleep(100);
        //时间消耗大于100毫秒

        //------------------------------------------------------
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
        //------------------------------------------------------
    }
}
