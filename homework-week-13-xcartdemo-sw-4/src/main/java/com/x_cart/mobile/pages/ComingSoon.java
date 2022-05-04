package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoon extends Utility {
    By comingText = By.xpath("//h1[text()='Coming soon']");

    public String verifyComingText(){
        return getTextFromElement(comingText);
    }
}
