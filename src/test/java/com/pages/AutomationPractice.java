package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPractice extends CommonPageElements{
    public AutomationPractice() {
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath = "//input[@id='et_pb_contact_name_0']")
    public WebElement nameInput;

    @FindBy (xpath = "//input[@id='et_pb_contact_email_0']")
    public WebElement emailInput;

    @FindBy (xpath = "//textarea[@id='et_pb_contact_message_0']")
    public WebElement messageInput;



}
