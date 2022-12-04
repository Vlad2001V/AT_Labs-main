package lab8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinusTest {

    @Test
    public void minusTest(){
        Assert.assertEquals(Calculator.minus(4, 2),2 );
        Assert.assertEquals(Calculator.minus(8, 4),4 );
        Assert.assertEquals(Calculator.minus(6, 1),5 );
    }
}
