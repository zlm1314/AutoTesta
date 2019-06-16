package com.course.testng.multiThread;

import org.testng.annotations.Test;
/***
        * Description: *
 * 使用注解来控制测试方法运行的次数和超时时间,
 * ,threadPoolSize设置了线程池的个数 * ,在观察结果时,发现很多值是重复的,
 * 但是可能不等于我们配置的线程池内线程个数,因为线程的个数还取决于硬件CPU的支持,
 * invocationCount----表示执行的次数,说明这个属性可以设置一个用例可以重复跑多次
 * timeOut-------超时时间-毫秒
 ***/
public class MultiThreadOnAnnotion {

    @Test(invocationCount = 2,threadPoolSize = 3)
    public void test(){
        //Thread.currentThread()是获取当前运行线程的对象
        //Thread.currentThread().getId(),是获取当前运行线程的ID
        System.out.println("调用线程为："+Thread.currentThread().getId());
        //Thread.currentThread().getName(),是获取当前运行线程的名字
        System.out.println("调用线程为："+Thread.currentThread().getName());
    }

}
