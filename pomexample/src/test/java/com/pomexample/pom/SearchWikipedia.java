package com.pomexample.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchWikipedia {
    
    protected WebDriver driver;
    
    private By searchInput = By.id("searchInput");
    private By searchButton = By.className("pure-button");
    private By articleTitle = By.className("mw-page-title-main");

    public SearchWikipedia(WebDriver driver) {
        this.driver = driver;
    }
    
    public void searchArticle(String palabra){
        driver.findElement(searchInput).sendKeys(palabra);
        driver.findElement(searchButton).click();
    }
    
    public String verifyTitle(){
        return driver.findElement(articleTitle).getText();
    }
    
}
