package com.sqa;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User di halaman login")
    public void User_di_halaman_login(){
        driver.get("http://akademik-ba.kemhan.go.id/");
        Assert.assertEquals(loginPage.TxthalamanAwalLogin(),"Login");
        extentTest.log(LogStatus.PASS,"User di halaman login");
    }

    @When("User memasukan username yang valid")
    public void User_memasukan_username_yang_valid(){
        loginPage.inputUsername("superadmin");
        extentTest.log(LogStatus.PASS,"User memasukan username yang valid");
    }

    @And("User memasukan password yang valid")
    public void User_memasukan_password_yang_valid(){
        loginPage.inputPassword("project_tekfunghan_123");
        extentTest.log(LogStatus.PASS,"User memasukan password yang valid");
    }

    @And("User klik tombol login")
    public void User_klik_tombol_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS,"User klik tombol login");
    }

    @Then("User berhasil login dan diarahkan ke dashbor")
    public void User_berhasil_login_dan_diarahkan_ke_halaman_dashbor(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"SISTEM PENGELOLAAN AKADEMIK");
        extentTest.log(LogStatus.PASS,"User berhasil login dan diarahkan ke halaman utama");
    }



}
