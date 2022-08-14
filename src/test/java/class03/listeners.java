package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener { // if you click on ITestListener you get info

    @Override
    public void onTestSuccess(ITestResult result){

        System.out.println("The test case has passed successfully :"+result.getName());

    }

    @Override
    public  void onTestFailure(ITestResult result){
        System.out.println("The test case has failed successfully :"+result.getName());
    }
}
