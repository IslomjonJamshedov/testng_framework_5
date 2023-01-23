package testing_knowledge;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _01_Annotation {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is Before method");
    }

    @Test
    public void test1(){
        System.out.println("This is test case 1");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is After method");
    }
}
