package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，标识测试方法，用来把方法标识为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("Test1--这是测试用例1");

    }
    @Test
    public  void testCase2(){
        System.out.println("Test2---这是测试用例2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMthod 这是在测试方法之后运行的");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod 这是在测试方法之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass 这是在类之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass---这是在类之前运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite---这是在类之前的测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite--这是在类之后的测试套件");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest----这是测试之后运行的");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest----这是在测试之前运行的");
    }
}
