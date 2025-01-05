package TestNg;

import org.testng.annotations.*;

public class TestNgClass1 {
     @BeforeSuite
    public void startReporting(){
        System.out.println("Reporting process started");
        System.out.println("---- Test");
    }
    @AfterSuite
    public void stopReporting(){
        System.out.println("Reporting process stopped");
    }
    @BeforeMethod
    @Parameters({"browser","url"})
    public void LaunchBrowserAndApplication(String browser, String Url){
        System.out.println(browser+"Launch Browser");
        System.out.println(Url+"is launched");
    }
    @BeforeMethod
    public void LoginIntoApplication(){
        System.out.println("Application login successful");
    }
    @AfterMethod
    public void LogoutFromApplication(){
        System.out.println("Application logout successful");
    }
    @AfterMethod
    public void closeBrowser(){
        System.out.println("Browser is closed");
        System.out.println();
    }

}
