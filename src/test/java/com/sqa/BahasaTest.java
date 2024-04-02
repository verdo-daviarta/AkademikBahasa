package com.sqa;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.drivers.DriverSingleton;
import com.sqa.pages.BahasaPage;
import com.sqa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BahasaTest {

    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static BahasaPage bahasaPage = new BahasaPage();

    public BahasaTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User berada di halaman Bahasa")
    public void User_berada_di_halaman_Bahasa() throws InterruptedException {
        driver.get("http://akademik-ba.kemhan.go.id/");
        loginPage.formLogin();
        Thread.sleep(3000);
        WebElement Bahasa = driver.findElement(By.xpath("//a[normalize-space()='Bahasa']"));
        Bahasa.click();
        extentTest.log(LogStatus.PASS,"User berada di halaman Bahasa");
    }

    @When("User klik button tambah baru")
    public void User_klik_button_tambah_baru() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.clickBtnTambah();
        extentTest.log(LogStatus.PASS,"User klik button tambah baru");
    }

    @And("User input jenis bahasa yang ingin dibuat")
    public void User_input_jenis_bahasa_yang_ingin_dibuat() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.inputBahasa("Bahasa Testing 2");
        extentTest.log(LogStatus.PASS,"User input jenis bahasa yang ingin dibuat");
    }

    @And("User memilih deskripsi")
    public void User_memilih_deskripsi() throws InterruptedException {
        DriverSingleton.delay(2);
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"addModal\"]/div/div/div/div/div[2]/div/form/div[1]/div[2]/select"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("KIBI");
        extentTest.log(LogStatus.PASS,"User memilih deskripsi");
    }

    @And("User klik button simpan")
    public void User_klik_button_simpan() throws InterruptedException {
        Thread.sleep(2000);
        bahasaPage.clickBtnSimpan();
        extentTest.log(LogStatus.PASS,"User klik button simpan");
    }

    @Then("User berhasil menemukan bahasa yang baru ditambahkan")
    public void User_berhasil_menemukan_bahasa_yang_baru_ditambahkan() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.inputSearch("Bahasa Testing 2");
        Assert.assertTrue(bahasaPage.GetTxtValidasiSearch().contains("Bahasa Testing 2 KIBI 2 April 2024"));
        extentTest.log(LogStatus.PASS,"User berhasil menemukan bahasa yang baru ditambahkan");
    }

//-----------2-------------

    @When("User klik button PDF")
    public void userKlikButtonPDF() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.clickEksporPdf();
        extentTest.log(LogStatus.PASS,"User klik button PDF");
    }

    @Then("User berhasil mendapatkan daftar dalam bentuk pdf")
    public void userBerhasilMendapatkanDaftarDalamBentukPdf() {
        ArrayList<String>newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        System.out.println("PDF "+driver.getTitle());
        extentTest.log(LogStatus.PASS,"User berhasil mendapatkan daftar dalam bentuk pdf");
    }

//-----------3-------------

    @When("User klik button Ekspor")
    public void userKlikButtonEkspor() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.clickEksporExcel();
        extentTest.log(LogStatus.PASS,"User klik button Ekspor");
    }

    @Then("User berhasil mendapatkan daftar dalam bentuk Excel")
    public void userBerhasilMendapatkanDaftarDalamBentukExcel() {
    }


//-----------4-------------

    @Given("User memilih data yang ingin diubah")
    public void userMemilihDataYangInginDiubah() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("http://akademik-ba.kemhan.go.id/");
        loginPage.formLogin();
        Thread.sleep(3000);
        WebElement Bahasa = driver.findElement(By.xpath("//a[normalize-space()='Bahasa']"));
        Bahasa.click();
        Thread.sleep(3000);
        bahasaPage.inputSearch("Bahasa Testing 2");
        extentTest.log(LogStatus.PASS,"User memilih data yang ingin diubah");
    }

    @When("User klik button ubah")
    public void userKlikButtonUbah() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.clickBtnEdit();
        extentTest.log(LogStatus.PASS,"User klik button ubah");
    }

    @And("User ubah jenis bahasa")
    public void userUbahJenisBahasa() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.editInputBahasa();
        extentTest.log(LogStatus.PASS,"User input jenis bahasa yang ingin dibuat");
    }

    @And("User ubah deskripsi")
    public void userUbahDeskripsi() throws InterruptedException {
        DriverSingleton.delay(2);
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"tab-content-1\"]/div/div/form/div[1]/div[2]/select"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("KIBA");
        extentTest.log(LogStatus.PASS,"User ubah deskripsi");
    }

    @Then("User berhasil mendapatkan daftar yang sudah diubah")
    public void userBerhasilMendapatkanDaftarYangSudahDiubah() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.inputSearch("Bahasa Testing Edit");
        Assert.assertTrue(bahasaPage.GetTxtValidasiSearch().contains("Bahasa Testing"));
        extentTest.log(LogStatus.PASS,"User berhasil menemukan bahasa yang baru ditambahkan");
    }


//-----------5-------------

    @When("User klik button delete")
    public void userKlikButtonDelete() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.clickBtnHapus();
        extentTest.log(LogStatus.PASS,"User klik button delete");
    }

    @And("User klik button iya")
    public void userKlikButtonIya() throws InterruptedException {
        Thread.sleep(3000);
        bahasaPage.clickBtnIya();
        extentTest.log(LogStatus.PASS,"User klik button iya");
    }

    @Then("User berhasil menghapus bahasa")
    public void userBerhasilMenghapusBahasa() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(bahasaPage.GetTxtSuccessHapus().contains("Bahasa berhasil diperbarui"));
        extentTest.log(LogStatus.PASS,"User berhasil menghapus bahasa");
    }



}
