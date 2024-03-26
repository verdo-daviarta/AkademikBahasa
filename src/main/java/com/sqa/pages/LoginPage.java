package com.sqa.pages;

import com.sqa.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Element
    @FindBy(xpath = "//h1[@class='mb-10 text-center text-5xl font-bold text-[#3452c1] lg:mb-16 lg:text-left lg:text-[80px]']")
    private WebElement halamanLogin;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='w-full rounded-full bg-[#3452c1] py-3 text-xl text-white']")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[contains(text(),'SISTEM PENGELOLAAN AKADEMIK')]")
    private WebElement TxtValidLogin;

    @FindBy(xpath = "//p[@class='absolute bottom-16 left-1/2 w-full -translate-x-1/2 text-center text-red-500 lg:left-0 lg:-translate-x-0']")
    private WebElement TxtInvalidLogin;

//---------------------------------------------------

    public String TxthalamanAwalLogin(){ return halamanLogin.getText();}

    public void formLogin(){
        username.sendKeys("superadmin");
        password.sendKeys("project_tekfunghan_123");
        btnLogin.click();
    }

    public void inputUsername(String username){this.username.sendKeys(username);}

    public void inputPassword(String password){this.password.sendKeys(password);}

    public void clickBtnLogin(){btnLogin.click();}

    public String getTxtDashboard(){return TxtValidLogin.getText();}

    public String getTxtInvalid(){return TxtInvalidLogin.getText();}



}
