package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;
import pages.basepagesconfiguration.BasePageClass;



public class TestListeners implements ITestListener {
    protected static Logger logger = Logger.getLogger(BasePageClass.class);

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("On Test Start " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("On Test Success " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.warn("On Test Failed " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
