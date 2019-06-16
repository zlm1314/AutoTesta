package com.course.testng;

import org.testng.annotations.Test;

public class Exception {
    //这是一个失败的一场测试，会失败
    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个成功的一场测试，会抛出异常
    @Test(expectedExceptions =RuntimeException.class)
    public void exceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
