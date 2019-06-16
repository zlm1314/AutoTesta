package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "name1")
    public void testDataProvider(String name,int age,String sex){
        System.out.println("第一种方法 name="+name+"; age="+age+"; sex="+sex);
    }
    @DataProvider(name="name1")
    public Object[][] providerDate(){
        Object[][] o = new Object[][]{
                {"张三",10,"女"},
                {"lisi",20,"男"}
        };
        return o;
    }
    //第2种方法
    @Test(dataProvider ="me")
    public void test1(String name,int age,String sex){
        System.out.println("第2种方法test1111 name="+name+"; age="+age+"; sex="+sex);
    }
    @Test(dataProvider="me")
    public void test2(String name,int age,String sex){
        System.out.println("第2种方法test2222 name="+name+"; age="+age+"; sex="+sex);
    }
    @DataProvider(name="me")
    public Object[][] test3(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"xiaoyi",2,"女"}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"xiaoer",3,"男"}
            };
        }
        return result;
    }
}
