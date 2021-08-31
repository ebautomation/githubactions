import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    private Demo demo;
    @Test
    public void TestDemo()
    {
        demo = new Demo();
        Assert.assertTrue(demo.GetName("Naveen") == "Naveen1");
    }
}
