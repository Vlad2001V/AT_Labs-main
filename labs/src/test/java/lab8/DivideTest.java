package lab8;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivideTest {


    @Test
    public void divideTest(){
        Assert.assertEquals(Calculator.divide(4, 2),2 );
        Assert.assertEquals(Calculator.divide(8, 4),2 );
        Assert.assertEquals(Calculator.divide(6, 2),3 );
    }
}
