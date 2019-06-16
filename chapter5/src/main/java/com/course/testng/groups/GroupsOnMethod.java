package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "Server")
    public void testCase1(){
        System.out.println("这是服务端测试1");
    }
    @Test(groups = "Server")
    public void testCase2(){
        System.out.println("这是服务端测试2");
    }
    @Test(groups = "Client")
    public void testCase3(){
        System.out.println("这是客户端测试3");
    }
    @Test(groups = "Client")
    public void testCase4(){
        System.out.println("这是客户端测试4");
    }
    @AfterGroups("Server")
    public void afterGroupsOnSever(){
        System.out.println("这是在服务端组后运行的");
    }

}
