package java.org.example;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class getDemo
{
    @BeforeSuite
    void setup()
    {
        System.out.println("Setup");
    }
  @Test
    void get_req(){

    }
   @AfterSuite
    void teamDown(){

    }
}
