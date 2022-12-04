package lab8;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddTest {
    @DataProvider
    public static Object[][] addTestProvider() {
        Object[][] provider = new Object[2][3];
        provider[0][0] = 1;
        provider[0][1] = 2;
        provider[0][2] = 3;
        provider[1][0] = 2;
        provider[1][1] = 4;
        provider[1][2] = 6;
        return provider;
    }
    @Test(dataProvider = "addTestProvider")
    public void addTest(Integer a, Integer b, Integer expectedResult){
        Assert.assertEquals(Calculator.add(a,b), expectedResult.intValue(), "Invalid result!");
    }
}
