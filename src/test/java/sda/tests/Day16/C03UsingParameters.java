package sda.tests.Day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C03UsingParameters {

    @Test
    @Parameters("name")
    public void parametIzedTest(String name){
        System.out.println("welcome "+name);
    }

    @Test
    @Parameters({"name","surname","age"})
    public void threeParameterTest(String name ,String surname ,String age){
        System.out.println("hello "+name +" "+surname+ " "+age);

    }

}
