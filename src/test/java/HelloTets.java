import org.junit.Assert;
import org.junit.Test;

public class HelloTets {
    @Test
    public void testHello(){
        Assert.assertEquals("Hello !!!",Hello.hello());
    }
}
