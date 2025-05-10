package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay Vaghani
 */
public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"prime@gmail.com", "test123"},
                {"prime1@gmail.com", "test345"},
                {"prime2@gmail.com", "test345"}
        };
        return data;
    }
}
