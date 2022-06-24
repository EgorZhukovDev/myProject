package framework.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
    @Parameters({"db"})
    @Test (groups = {"smokeTest", "regressTest"})
    public void test1(String db){
        System.out.println("Test 1 is starting" + db);
    }

    @Test (groups = {"regressTest"})
    public void test11(){
        System.out.println("Test 11 is starting");
    }

    @Test (groups = {"regressTest"})
    public void test111(){
        System.out.println("Test 111 is starting");
    }
}
