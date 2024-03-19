package sda.tests.Day18;

import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class C01ParallelTest01 extends TestBase {
    // Thread.currentThread().getId(): Returns the ID of the thread executing the method.
// Since there is no interference when this class is executed, the execution is sequential.
// If we want to make the tests in this class run in parallel, we can configure it in the XML file.
    @Test
    public void Test01(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 01"+threadsName);
    }
    @Test
    public void Test02(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 02"+threadsName);
    }
    @Test
    public void Test03(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 03"+threadsName);
    }
    @Test
    public void Test04(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 04"+threadsName);
    }

    @Test
    public void Test05(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 05"+threadsName);
    }
    @Test
    public void Test06(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 06"+threadsName);
    }

    @Test
    public void Test07(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 07"+threadsName);
    }
    @Test
    public void Test08(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 08"+threadsName);
    }
}
