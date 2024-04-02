package com.sqa.pages;

import com.sqa.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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



}
