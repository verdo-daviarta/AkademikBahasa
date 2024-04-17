package com.sqa.pages;

import com.sqa.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.Struct;

public class KursusPage {

    private WebDriver driver;

    public KursusPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Element

    @FindBy(linkText= "//a[normalize-space()='Kursus']")
    private WebElement halamanKursus;

    @FindBy(xpath = "//span[normalize-space()='Tambah Baru']")
    private WebElement btnTambahBaru;

    @FindBy(xpath = "//input[@name='nama']")
    private WebElement inputNama;

    @FindBy(xpath = "//span[@id='select2-bahasa_id-79-container']")
    private WebElement pilihBahasa;

    @FindBy(xpath = "//span[@id='select2-tingkat-pd-container']")
    private WebElement pilihTingkat;

    @FindBy(xpath = "//textarea[@name='desc']")
    private WebElement inputNamaKursus;

    @FindBy(xpath = "//input[@name='judul[]']")
    private WebElement inputSubjekMapel;

    @FindBy(xpath = "//input[@name='total_jam[]']")
    private WebElement totalJam;

    @FindBy(xpath="(//input[@value='Simpan'])[1]")
    @CacheLookup
    private WebElement btnSimpan;

    public void clickHalamanKursus(){halamanKursus.click();}

    public void clickTambah(){btnTambahBaru.click();}

    public void inputNama(String inputNama){this.inputNama.sendKeys(inputNama);}

    public void inputMataPelajaran(String inputSubjekMapel){this.inputSubjekMapel.sendKeys(inputSubjekMapel);}

    public void inputNamaKursus(String inputNamaKursus){this.inputNamaKursus.sendKeys(inputNamaKursus);}

    public void inputTotalJam(String totalJam){this.totalJam.sendKeys(totalJam);}

    public void clickBtnSimpan(){
        btnSimpan.click();}


}
