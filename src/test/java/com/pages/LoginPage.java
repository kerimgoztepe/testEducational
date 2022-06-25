package com.pages;

import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonPageElements{
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
}
