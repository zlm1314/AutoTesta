package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("忽略测试3----默认enabled为true");
    }




    @Test
    public void ingore1() {
        System.out.println("忽略测试1---执行");
    }

    @Test(enabled = false)
    public void ignore2() {
        System.out.println("忽略测试2---不想执行");
    }
}
