package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SaleProducts extends Utility {
    By saleText = By.xpath("//h1[text()='Sale']");
    By sortBy = By.xpath("//span[text()='Sort by:']");
    By sortAToZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By aToZTextVerify = By.xpath("//span[text()='Name A - Z']");
    By sortPriceLowHigh = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By lowToHighTextVerify = By.xpath("//span[text()='Price Low - High']");
    By sortByRate = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]");
    By rateTextVerify = By.xpath("//span[text()='Rates ']");


    public String verifySaleText() {
        return getTextFromElement(saleText);
    }

    public void mouseHoverOnSortBy() {
        mouseHoverToElementAndClick(sortBy);
    }
    public void clickOnSortAToZ(){
        clickOnElement(sortAToZ);
    }
    public void clickOnSortPriceLowtoHigh(){
        clickOnElement(sortPriceLowHigh);
    }
    public void clickOnSortByRate(){
        clickOnElement(sortByRate);
    }
    public String verifyAToZText(){
        return getTextFromElement(aToZTextVerify);
    }
    public String verifyLowToHighText(){
        return getTextFromElement(lowToHighTextVerify);
    }
    public String verifyRateText(){
        return getTextFromElement(rateTextVerify);
    }



}
