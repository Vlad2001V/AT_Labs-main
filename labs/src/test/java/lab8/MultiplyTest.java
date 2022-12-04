package lab8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTest {
    @Test
    public void multiplyTest(){
        Assert.assertEquals(Calculator.minus(4, 2),8 );
        Assert.assertEquals(Calculator.minus(3, 4),12 );
        Assert.assertEquals(Calculator.minus(6, 1),6 );
    }
}
