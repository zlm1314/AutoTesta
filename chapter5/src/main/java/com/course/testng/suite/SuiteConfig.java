package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite---之后运行的套件");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite----之前运行的套件");
    }
}
