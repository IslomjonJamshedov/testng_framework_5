package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalDropdownsPage;
import pages.TechGlobalFrontendTestingHomePage;
import utilities.DropDownHandler;
import utilities.Waiter;


public class TechGlobalDropdownsTest extends TechGlobalBase{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalDropdownsPage = new TechGlobalDropdownsPage();

        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("Dropdowns");

    }
    @Test(priority = 1, description = "Select Delivery Option")
    public void selectDeliveryOption(){


        DropDownHandler.clickOnDropdownOption(techGlobalDropdownsPage.deliveryDropdown,
                techGlobalDropdownsPage.deliveryDropdownOptions,"Delivery");
    }

    @Test(priority = 2, description = "Select Iphone 14 Pro Max option")
    public void selectProductOption(){

        DropDownHandler.selectByVisibleTest(techGlobalDropdownsPage.productDropdown, "iPhone 14 Pro Max");
    }

    @Test(priority = 3, description = "Select Yellow options")
    public void selectColorOption(){

       DropDownHandler.selectByIndex(techGlobalDropdownsPage.colorDropdown, 1);
    }

    @Test(priority = 4, description = "Validate the selected message")
    public void selectMacbook(){
        DropDownHandler.selectByIndex(techGlobalDropdownsPage.productDropdown, 3);
        DropDownHandler.selectByVisibleTest(techGlobalDropdownsPage.colorDropdown, "Silver");
        DropDownHandler.clickOnDropdownOption(techGlobalDropdownsPage.deliveryDropdown,
                techGlobalDropdownsPage.deliveryDropdownOptions, "Delivery");

        techGlobalDropdownsPage.submitButton.click();

        Assert.assertEquals(techGlobalDropdownsPage.resultMessage.getText(),
                "Your Silver MacBook Pro 13 will be delivered to you");
        Waiter.pause(5);
    }
}
