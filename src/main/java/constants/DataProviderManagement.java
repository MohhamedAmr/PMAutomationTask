package constants;

import org.testng.annotations.DataProvider;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataProviderManagement {
    //Class for Data Driven Management
    @DataProvider(name = "checkoutData")
    public static Object[][] getCheckoutData() {
        //For Generating Numbers After main email name to avoid error while registering
        String current = new SimpleDateFormat("SSSS").format(new Date());
        String email = "muhamed.elsarky" + current + "@gmail.com";
/*
        Note that we Can Add Multiple Dynamic Objects Based on Fake Data
        In case of we Decide to Add Multiple TestCases Handles Different use cases
*/

        return new Object[][]{
                {UserConstants.FIRST_NAME+"D",UserConstants.LAST_NAME+"y",email,UserConstants.LAST_NAME+UserConstants.PASSWORD}
        };
    }
}
