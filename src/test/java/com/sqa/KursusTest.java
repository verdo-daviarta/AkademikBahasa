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
        Thread.sleep(3000);
        WebElement Kursus = driver.findElement(By.xpath("//a[normalize-space()='kursus']"));
        Kursus.click();
        extentTest.log(LogStatus.PASS,"User berada di halaman Kursus");
    }

    @When("User klik button tambah baru")
    public void User_klik_button_tambah_baru() throws InterruptedException {
        Thread.sleep(3000);
        kursusPage.clickTambah();
        extentTest.log(LogStatus.PASS,"User klik button tambah baru");
    }

    @And("User input kursus yang ingin dibuat")
    public void userInputKursusYangInginDibuat() {
    }

    @And("User memilih Bahasa")
    public void userMemilihBahasa() {
    }

    @And("User memilih tingkat")
    public void userMemilihTingkat() {
    }

    @And("User input nama Kursus")
    public void userInputNamaKursus() {
    }

    @And("User input nama Mata Pelajaran")
    public void userInputNamaMataPelajaran() {
    }

    @And("User input total jam")
    public void userInputTotalJam() {
    }

    @And("User klik button simpan")
    public void User_klik_button_simpan() throws InterruptedException {
        Thread.sleep(2000);
        kursusPage.clickBtnSimpan();
        extentTest.log(LogStatus.PASS,"User klik button simpan");
    }

    @Then("User berhasil menemukan kursus yang baru ditambahkan")
    public void userBerhasilMenemukanKursusYangBaruDitambahkan() {
    }
}
