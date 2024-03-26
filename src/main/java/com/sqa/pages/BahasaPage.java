package com.sqa.pages;

import com.sqa.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy(xpath = "")
    private WebElement halamanBahasa;

    @FindBy(xpath = "//span[normalize-space()='Tambah Baru']")
    private WebElement btnTambahBaru;

    @FindBy(name = "nama")
    private WebElement JenisBahasa;

    @FindBy(xpath = "//span[@id='select2-desc-ou-container']")
    private WebElement Deskripsi;

    @FindBy(name = "//input[@value='Simpan']")
    private WebElement btnSimpan;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement ColoumnSearch;

    @FindBy(xpath = "//*[@id='tableBahasas']/tbody/tr")
    private WebElement ValidasiPencarian;



//----------------------------------------------------------------------

    public void clickHalamanBahasa(){halamanBahasa.click();}

    public void clickBtnTambah(){btnTambahBaru.click();}

    public void inputBahasa(String JenisBahasa){this.JenisBahasa.sendKeys(JenisBahasa);}

    public void pilihDeskripsi(){
        Select select = new Select(Deskripsi);
        select.selectByValue("KIBI");
    }

    public void clickBtnSimpan(){btnSimpan.click();}

    public void inputSearch(String ColoumnSearch){this.ColoumnSearch.sendKeys(ColoumnSearch);}

    public String GetTxtValidasiSearch(){return ValidasiPencarian.getText();}




}
//*[@id="select2-desc-1l-container"]
//*[@id="select2-desc-1l-container"]
//*[@id="addModal"]
//*[@id="addModal"]/div/div/div/div/div[2]/div/form/div[1]/div[2]/select
//*[@id="addModal"]/div/div/div/div/div[2]/div/form/div[1]/div[2]/span
//*[@id="addModal"]/div/div/div/div/div[2]/div/form/div[3]/input
