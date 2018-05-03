package junitdemo;

import org.junit.*;

public class Test4 {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("this is test4 beforeclass");
    }

    @Before
    public void before(){
        System.out.println("this is test4 before");
    }

    @Test
    public void fun1(){
        System.out.println("this is test4 fun1");
    }

    @Test
    public void fun2(){
        System.out.println("this is test4 fun2");
    }

    @After
    public void after(){

        System.out.println("this is test4 after");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("this is test4 afterclass");
    }
}
