package com.sqa.pages;

import com.sqa.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BahasaPage {

    private WebDriver driver;

    public BahasaPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Element

    @FindBy(linkText= "//a[normalize-space()='Bahasa']")
    private WebElement halamanBahasa;

    @FindBy(xpath = "//span[normalize-space()='Tambah Baru']")
    private WebElement btnTambahBaru;

    @FindBy(name = "nama")
    private WebElement JenisBahasa;

    @FindBy(xpath = "//span[@id='select2-desc-ou-container']")
    private WebElement Deskripsi;

    @FindBy(xpath="(//input[@value='Simpan'])[1]")
    @CacheLookup private WebElement btnSimpan;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement ColoumnSearch;

    @FindBy(xpath = "//*[@id='tableBahasas']/tbody/tr")
    private WebElement ValidasiPencarian;

    @FindBy(xpath = "//*[@id='tableBahasas_wrapper']/div[1]/button[2]")
    private WebElement exportPdf;

    @FindBy(xpath = "//*[@id='tableBahasas_wrapper']/div[1]/button[1]")
    private WebElement exportExcel;

    @FindBy(xpath = "//form[@id='delete_156']//i[@class='fa fa-edit']")
    private WebElement btnEdit;

    @FindBy(xpath = "//*[@id='delete_159']/div/button")
    private WebElement btnHapus;

    @FindBy(xpath = "//button[normalize-space()='Iya']")
    private WebElement btnIya;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement TxtalertSuccessDelete;



//----------------------------------------------------------------------

    public void clickHalamanBahasa(){halamanBahasa.click();}

    public void clickBtnTambah(){btnTambahBaru.click();}

    public void inputBahasa(String JenisBahasa){this.JenisBahasa.sendKeys(JenisBahasa);}

    public void editInputBahasa(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", JenisBahasa);
        JenisBahasa.sendKeys("Bahasa Testing Edit 2");
    }

    public void pilihDeskripsi(){
        Select select = new Select(Deskripsi);
        select.selectByValue("KIBI");
    }

    public void clickBtnSimpan(){
        btnSimpan.click();}

    public void inputSearch(String ColoumnSearch){this.ColoumnSearch.sendKeys(ColoumnSearch);}

    public String GetTxtValidasiSearch(){return ValidasiPencarian.getText();}

    public void clickEksporPdf(){exportPdf.click();}

    public void clickEksporExcel(){exportExcel.click();}

    public void clickBtnEdit(){btnEdit.click();}

    public void clickBtnHapus(){btnHapus.click();}

    public void clickBtnIya(){btnIya.click();}

    public String GetTxtSuccessHapus(){return TxtalertSuccessDelete.getText();}

}
//*[@id="select2-desc-1l-container"]
//*[@id="select2-desc-1l-container"]
//*[@id="addModal"]
//*[@id="addModal"]/div/div/div/div/div[2]/div/form/div[1]/div[2]/select
//*[@id="addModal"]/div/div/div/div/div[2]/div/form/div[1]/div[2]/span
//*[@id="addModal"]/div/div/div/div/div[2]/div/form/div[3]/input
