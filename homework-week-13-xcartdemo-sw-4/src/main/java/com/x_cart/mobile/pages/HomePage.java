package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By shippingLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Shipping']");
    By newLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='New!']");
    By comingSoonLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Coming soon']");
    By contactUsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Contact us']");
    By hotDealLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']");
    By saleLink = By.xpath("//li[@class='leaf has-sub']//span[text()='Sale']");
    By bestSellerLink = By.xpath("//li[@class='leaf has-sub']//span[text()='Bestsellers']");

    public void clickonShipping(){
        clickOnElement(shippingLink);
    }
    public void clickOnNew(){
        clickOnElement(newLink);
    }
    public void clickOnComingSoon(){
        clickOnElement(comingSoonLink);
    }
    public void clickOnContactUs(){
        clickOnElement(contactUsLink);
    }
    public void mouseHoverNClickHotDeal(){
        mouseHoverToElementAndClick(hotDealLink);
    }
    public void mouseHoverNclickSale(){
       mouseHoverToElement(saleLink);
    }
    public void mouseHoverNclickBestSeller(){
       mouseHoverToElement(bestSellerLink);
    }
}
