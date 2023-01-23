package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalRadioButtonsPage;

public class TechGlobalRadioButtonsTest extends TechGlobalBase {

    @BeforeMethod
    public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalRadioButtonsPage = new TechGlobalRadioButtonsPage();
    }

    @Test(priority = 1, description = "Validating TechGlobal Language Radio Buttons")
    public void languageRadioButton() {
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(5);


        for (int i = 1; i < techGlobalRadioButtonsPage.radioButtonsInput.size(); i++) {
            Assert.assertTrue(techGlobalRadioButtonsPage.radioButtonsLabel.get(0).isSelected());
            Assert.assertFalse(techGlobalRadioButtonsPage.radioButtonsLabel.get(1).isSelected());
            Assert.assertFalse(techGlobalRadioButtonsPage.radioButtonsLabel.get(2).isSelected());
        }
        techGlobalRadioButtonsPage.radioButtonsLabel.get(0).click();
        Assert.assertTrue(techGlobalRadioButtonsPage.radioButtonsInput.get(0).isSelected());
    }

        @Test(priority = 2, description = "Checking 2nd Radio Buttons")
        public void WebDriverRadioButtons() {
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(5);
            for (int i = 0; i < techGlobalRadioButtonsPage.radioButtonsInput.size(); i++) {
                Assert.assertTrue(techGlobalRadioButtonsPage.radioButtonsLabel2.get(i).isDisplayed());
                Assert.assertTrue(techGlobalRadioButtonsPage.radioButtonsInput2.get(i).isEnabled());
                Assert.assertFalse(techGlobalRadioButtonsPage.radioButtonsLabel2.get(i).isSelected());
            }
            techGlobalRadioButtonsPage.radioButtonsLabel2.get(1).click();
            Assert.assertTrue(techGlobalRadioButtonsPage.radioButtonsInput2.get(1).isSelected());
            Assert.assertFalse(techGlobalRadioButtonsPage.radioButtonsInput2.get(0).isSelected());
            Assert.assertFalse(techGlobalRadioButtonsPage.radioButtonsInput2.get(2).isSelected());

            techGlobalRadioButtonsPage.radioButtonsLabel2.get(2).click();
            Assert.assertTrue(techGlobalRadioButtonsPage.radioButtonsInput2.get(2).isSelected());
            Assert.assertFalse(techGlobalRadioButtonsPage.radioButtonsInput2.get(0).isSelected());
            Assert.assertFalse(techGlobalRadioButtonsPage.radioButtonsInput2.get(1).isSelected());
        }
    }

