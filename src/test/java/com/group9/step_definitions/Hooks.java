package com.group9.step_definitions;

import com.group9.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Test setup");
        //Driver.getDriver().manage().window().maximize();
        Driver.getDriver();

    }

    @After
    public void tearDown(Scenario scenario){
        //Scenario class that is helping us to attach screenshot to the report
        //how to check if scenario failed
        if (scenario.isFailed()) {
            //TakeScreenSHot interface comes from Selenium WebDriver
            //output is in Bytes
            //method that attaches image to the report requires array of Bytes (.embed () method)
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //attach screenshot to the report
            scenario.embed(image, "image/png", scenario.getName());
        }
        System.out.println("Test clean up");
        Driver.closeDriver();
    }
}
