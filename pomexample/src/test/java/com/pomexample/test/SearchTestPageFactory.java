package com.pomexample.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pomexample.PageFactory.SearchWikipedia;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTestPageFactory {
    
    WebDriver driver;
    SearchWikipedia searchWiki;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
    }
    
    @AfterEach
    public void tearDown() {
        //driver.quit();
    }
    
    @Test
    public void searchTest() {
        searchWiki = new SearchWikipedia(driver);
        searchWiki.searchArticle("Selenium");
        assertEquals("Selenium",searchWiki.verifyTitle());
    }
}

