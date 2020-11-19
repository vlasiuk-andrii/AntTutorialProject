import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

public class HelloWorldTest {

    static Logger logger = Logger.getLogger(HelloWorld.class);

    @Test
    public void testNothing() {
        System.out.println("sout : First test");
    }

    @Test
    public void testWillAlwaysFail() {
        logger.info("log.info : Second test");
        fail("An error message");
    }

    @Ignore
    @Test
    public void testToBeIgnored() {
        System.out.println("sout : Ignored test");
    }

}