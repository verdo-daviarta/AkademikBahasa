package com.sqa;

import com.relevantcodes.extentreports.ExtentTest;
import com.sqa.pages.KursusPage;
import com.sqa.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class KursusTest {
    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static KursusPage kursusPage = new KursusPage();

    public KursusTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }



}
