import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outStream));
    }

    @Test
    public void testSayHello() {
        HelloWorld hw = new HelloWorld();
        hw.sayHello();
        Assertions.assertEquals("Hello World.", outStream.toString());
    }

    @AfterEach
    public void cleanUp() {
        System.setOut(null);
    }
}