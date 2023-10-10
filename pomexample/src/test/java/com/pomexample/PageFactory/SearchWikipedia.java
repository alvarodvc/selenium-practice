package com.pomexample.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchWikipedia {
    
    protected WebDriver driver;
    
    // private By searchInput = By.id("searchInput");
    @FindBy(id="searchInput")
    WebElement searchInput;

    // private By searchButton = By.className("pure-button");
    @FindBy(className = "pure-button")
    WebElement searchButton;

    // private By articleTitle = By.className("mw-page-title-main");
    @FindBy(className = "mw-page-title-main")
    WebElement articleTitle;

    public SearchWikipedia(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void searchArticle(String palabra){
        searchInput.sendKeys(palabra);
        searchButton.click();
    }
    
    public String verifyTitle(){
        return articleTitle.getText();
    }
    
}
