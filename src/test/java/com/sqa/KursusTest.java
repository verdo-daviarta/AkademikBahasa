package com.sqa;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.pages.KursusPage;
import com.sqa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class KursusTest {
    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static KursusPage kursusPage = new KursusPage();

    public KursusTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User berada di halaman Kursus")
    public void User_berada_di_halaman_Kursus() throws InterruptedException {
        driver.get("http://akademik-ba.kemhan.go.id/");
        loginPage.formLogin();
        Thread.sleep(4000);
        WebElement Kursus = driver.findElement(By.xpath("//a[normalize-space()='Kursus']"));
        Kursus.click();
        extentTest.log(LogStatus.PASS,"User berada di halaman Kursus");
    }

//    @When("User klik button tambah baru")
//    public void User_klik_button_tambah_baru() throws InterruptedException {
//        Thread.sleep(3000);
//        kursusPage.clickTambah();
//        extentTest.log(LogStatus.PASS,"User klik button tambah baru");
//    }

    @And("User input Nama")
    public void User_input_Nama()throws InterruptedException {
        Thread.sleep(3000);
        kursusPage.inputNama("Testing SQA");
        extentTest.log(LogStatus.PASS,"User input Nama");
    }

    @And("User memilih Bahasa")
    public void userMemilihBahasa() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"addModal\"]/div/div/div/div/div[2]/div/form/div[1]/div[2]/select"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("158");
        extentTest.log(LogStatus.PASS,"User memilih Bahasa");
    }

    @And("User memilih tingkat")
    public void userMemilihTingkat() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dropdownTingkat = driver.findElement(By.xpath("//*[@id=\"addModal\"]/div/div/div/div/div[2]/div/form/div[1]/div[3]/select"));
        Select dropdown = new Select(dropdownTingkat);
        dropdown.selectByValue("1");
        extentTest.log(LogStatus.PASS,"User memilih tingkat");
    }

    @And("User input nama Kursus")
    public void userInputNamaKursus() throws InterruptedException {
        Thread.sleep(3000);
        kursusPage.inputNamaKursus("Testing Nama Kursus SQA");
        extentTest.log(LogStatus.PASS,"User input nama Kursus");
    }

    @And("User input nama Mata Pelajaran")
    public void userInputNamaMataPelajaran() throws InterruptedException {
        Thread.sleep(3000);
        kursusPage.inputMataPelajaran("MapelTesting");
        extentTest.log(LogStatus.PASS,"User input nama Mata Pelajaran");
    }

    @And("User input total jam")
    public void userInputTotalJam() throws InterruptedException {
        Thread.sleep(3000);
        kursusPage.inputTotalJam("12");
        extentTest.log(LogStatus.PASS,"User input total jam");
    }

    @Then("User berhasil menemukan kursus yang baru ditambahkan")
    public void userBerhasilMenemukanKursusYangBaruDitambahkan() throws InterruptedException {
        Thread.sleep(3000);
        kursusPage.inputSearch("Testing SQA");
        Assert.assertTrue(kursusPage.GetTxtValidasiSearch().contains("Testing SQA"));
        extentTest.log(LogStatus.PASS,"User berhasil menemukan kursus yang baru ditambahkan");
    }


//------------------------------------------------------------------------------------

    @When("User klik button PDF di halaman kursus")
    public void userKlikButtonPDFDiHalamanKursus() throws InterruptedException {
        Thread.sleep(3000);
        kursusPage.clickEksporPdf();
        extentTest.log(LogStatus.PASS,"User klik button PDF di halaman kursus");
    }






}
